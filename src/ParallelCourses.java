import java.util.*;

class ParallelCourses {
    static class Course {
        int courseName;
        List<Course> prerequisites = new ArrayList<>();

        public Course(int courseName) {
            this.courseName = courseName;
        }
    }

    public int minimumSemesters(int N, int[][] relations) {

        Course[] courses = new Course[N+1];
        for (int i = 1; i <= N; i++) {
            courses[i] = new Course(i);
        }

        for (int i = 0; i < relations.length; i++) {
            courses[relations[i][0]].prerequisites.add(courses[relations[i][1]]);
        }

        Map<Integer, Integer> memo = new HashMap<>();
        int answer = 0;
        for (int i = 1; i <= N; i++) {
            Set<Integer> visited = new HashSet<>();
            visited.add(i);

            answer = Math.max(answer, dfs(i, visited, courses, memo));
        }

        if (answer == Integer.MAX_VALUE) {
            return -1;
        }

        return answer;
    }

    private static int dfs(int index, Set<Integer> visited, Course[] courses, Map<Integer, Integer> memo) {
        if (memo.containsKey(index)) {
            return memo.get(index);
        }

        List<Course> prereqs = courses[index].prerequisites;

        if (prereqs.size() == 0) {
            return 1;
        }

        int semesterNumber = 0;
        for (int i = 0; i < prereqs.size(); i++) {
            if (visited.contains(prereqs.get(i).courseName)) {
                memo.put(index, Integer.MAX_VALUE);
                return Integer.MAX_VALUE;
            }

            visited.add(prereqs.get(i).courseName);
            semesterNumber = Math.max(semesterNumber, dfs(prereqs.get(i).courseName, visited, courses, memo));
            visited.remove(prereqs.get(i).courseName);
        }

        int result = Integer.MAX_VALUE;
        if (semesterNumber != Integer.MAX_VALUE) {
            result = semesterNumber + 1;
        }

        memo.put(index, result);
        return result;
    }
}