class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++){
            if(babbling[i].equals("ye") || babbling[i].equals("ma") ||
              babbling[i].equals("yema") || babbling[i].equals("maye") ||
              babbling[i].equals("aya") || babbling[i].equals("woo") ||
              babbling[i].equals("ayaye") || babbling[i].equals("yeaya") ||
              babbling[i].equals("ayama") || babbling[i].equals("maaya") ||
              babbling[i].equals("wooye") || babbling[i].equals("yewoo") ||
              babbling[i].equals("wooma") || babbling[i].equals("mawoo") ||
              babbling[i].equals("ayawoo") || babbling[i].equals("wooaya") ||
              babbling[i].equals("ayayema") || babbling[i].equals("mayeaya") ||
              babbling[i].equals("yemaaya") || babbling[i].equals("ayamaye") ||
              babbling[i].equals("yeayama") || babbling[i].equals("maayaye") ||
              babbling[i].equals("wooyema") || babbling[i].equals("mayewoo") ||
              babbling[i].equals("yemawoo") || babbling[i].equals("woomaye") ||
              babbling[i].equals("yewooma") || babbling[i].equals("mawooye") ||
              babbling[i].equals("ayawooye") || babbling[i].equals("yewooaya") ||
              babbling[i].equals("wooayaye") || babbling[i].equals("yeayawoo") ||
              babbling[i].equals("wooyeaya") || babbling[i].equals("ayayewoo") ||
              babbling[i].equals("ayawooma") || babbling[i].equals("mawooaya") ||
              babbling[i].equals("wooayama") || babbling[i].equals("maayawoo") ||
              babbling[i].equals("woomaaya") || babbling[i].equals("ayamawoo") ||
              babbling[i].equals("ayayewooma") || babbling[i].equals("ayayemawoo") ||
              babbling[i].equals("ayamayewoo") || babbling[i].equals("ayamawooye") ||
              babbling[i].equals("ayawoomaye") || babbling[i].equals("ayawooyema") ||
              babbling[i].equals("wooayayema") || babbling[i].equals("wooayamaye") ||
              babbling[i].equals("wooyeayama") || babbling[i].equals("wooyemaaya") ||
              babbling[i].equals("woomayeaya") || babbling[i].equals("woomaayaye") ||
              babbling[i].equals("yewooayama") || babbling[i].equals("yewoomaaya") ||
              babbling[i].equals("yeayamawoo") || babbling[i].equals("yeayawooma") ||
              babbling[i].equals("yemaayawoo") || babbling[i].equals("yemawooaya") ||
              babbling[i].equals("maayawooye") || babbling[i].equals("maayayewoo") ||
              babbling[i].equals("mawooayaye") || babbling[i].equals("mawooyeaya") ||
              babbling[i].equals("mayeayawoo") || babbling[i].equals("mayewooaya")){
                answer++;
            }
        }
        
        return answer;
    }
}