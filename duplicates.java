class FindDuplicates {
    public static Set<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>(), duplicates = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) duplicates.add(num);
        }
        return duplicates;
    }
}     
