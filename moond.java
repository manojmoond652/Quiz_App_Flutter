class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int n=sentences.size();
        int ans=0;
        int d=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<sentences[i].size();j++){
                
                if(sentences[i][j]==' '){
                    d++;
                }
                

            }
            ans=max(ans,d+1);
                d=0;
        }
        return ans;
        
    }
};class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int n=sentences.size();
        int ans=0;
        int d=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<sentences[i].size();j++){
                
                if(sentences[i][j]==' '){
                    d++;
                }
                

            }
            ans=max(ans,d+1);
                d=0;
        }
        return ans;
        
    }
};
