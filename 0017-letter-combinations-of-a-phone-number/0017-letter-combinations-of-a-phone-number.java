class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        String[] Mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        backtrack(digits,0,"",result,Mapping);

        return result;
    }
    public void backtrack(String digits,int index,String current,List<String> result, String[]mapping){

        if(index >= digits.length()){
            result.add(current);
            return;
        }
        String letters = mapping[digits.charAt(index)-'0'];

        for(int i = 0;i < letters.length();i++){
            char letter = letters.charAt(i);

            backtrack(digits,index+1,current+letter,result,mapping);

        }
    }
}