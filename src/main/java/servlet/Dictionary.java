package servlet;

import java.util.HashMap;


public class Dictionary {

    /**
     * 英単語情報を表すHashMap (Key：英語、Value：日本語)
     */
    private HashMap<String, String> dictionaryInfo;


    public Dictionary() {

    	dictionaryInfo = new HashMap<String, String>();
    	
    	dictionaryInfo.put("apple", "りんご");
    	dictionaryInfo.put("orange", "みかん");
    	dictionaryInfo.put("peach", "もも");
    	dictionaryInfo.put("grape", "ぶどう");
    	dictionaryInfo.put("pear", "なし");
    	
    	setDictionaryInfo(dictionaryInfo);

    }



    public void setDictionaryInfo(HashMap<String, String> dictionaryInfo) {
        this.dictionaryInfo = dictionaryInfo;
    }

    public HashMap<String, String> getDictionaryInfo() {
        return dictionaryInfo;
    }

}