package _22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Given a list of unique words. Find all pairs of distinct indices (i, j) in the given list, so that the concatenation of the two words, i.e. words[i] + words[j] is a palindrome.
//Given words = ["bat", "tab", "cat"]
//Return [[0, 1], [1, 0]]

public class MainClass 
{
	public static int counter = 0;
	
	public static void main(String[] args) 
	{
		String words[] = {"cabdacacfdgbdecggfdd","addiheabijijha","bafahgecejbfehjbihbj","fhicddafhbbjcj","cbjbcdchjjaf","hadhab","dhbjccchhha","jadgaccdbge","ed","ig","fh","ajjhibafff","afeaaiedegdb","ebfhiebjdfjefchfabb","cdbeeacebgd","aahcjd","cjeh","biecicfeecifhe","j","bbfbfhh","gbceejhc","hebjgfbj","ihhagfcjc","cfhcf","iahiafhedffhafhj","jjjbfhjcac","hhhbbgbbjifbcjibjhg","eiieafjheaegfe","bch","bddfbea","dfbg","aeeadcgheagca","bjej","iddbbhaba","fgibjjegb","ehaaigdahjdhbigijdf","jcdghicbjfhghchgjc","bj","aibaiec","fbjidghciaahgi","heaga","cjiiedciffha","hcd","gbbigeicgbdfejddje","gjcdccfchchjjiacjj","hddceefacddbgjdae","aaeijgicgiebchjdai","ahf","b","gihaiegheha","bfifedadbig","eijfcjfcff","fjdjb","bciidebhfgbfihd","bi","gibefcgdjdjhgaajifa","jjiihieifhcdagdg","jjdfeabjghadgijj","bdjihibcfbi","jjgigfgi","agfihdcfhfehfjabhcf","ahfadffgdhcigfhfh","bbcjjhjfhchbjggdfej","efghggfjhdbcgga","ahjfaaahggahdacabi","adabgbde","ib","fagjibagdacjhde","ichbhhjga","gjjdggagdaieafb","haiaejbfbcachhjdaj","jfaeihdbfifa","gd","jjfgcbjfbgcdcc","ffje","cehddacei","diiheg","ecdefcbihcjhe","bfdhafchbfffjjggdjb","ceedbjdhahaeagdjjhhc","hichhafiiabbhf","gffjeggaiccdafgcaa","icghei","badhahbaibghejh","dcjgdjgehfifgajj","gaji","haidia","dghffggeaeddgfb","fgjjaeaje","bigjffjiffjhbfbhfia","dbgb","gfibedaihdhibhi","hejfeacc","fejibeejf","i","d","jecff","bbacedehjjefgbaeg","aebidej","hbacbdibiaehfce","gfiaaccb","fcecgahjg","cf","gbdja","giigcbgdgdgfejcgcica","daaaadhffgbaac","eibgahcbij","ah","acfhgjjdbfhiafaajj","aabhaihfcjc","jhg","bbfjebgde","jafdheefcdjjffb","ijhjhaffgef","ejbfjdi","hjcabjdf","gbdgeahibbach","bhfcffdhiihifeacageh","giieef","cbhhijbdidceiee","jjgbeadcahdahi","iadjfge","edeeciaaihichd","gjiiac","h","edieacjieghfdja","ddefahibbjhjiba","fcgegeijigcbbagigce","jecbd","biiac","fgjhbhgdifcig","ghjageidjfghgi","fdeediahjeijj","bicjbejfjaghbahgdgih","ba","beihcfjgc","cccfijfdbjeciih","dfjfiafjbf","icdfdihjhfbif","acghidhcidie","jeeiifbhheggj","cjbgacfjfidfcccbfaa","jbgccddcfifbb","ageffh","ejjb","caffifihdggdjcbdhjcd","eidjfafbfdbgjej","bfibaeachgidhabhjcg","edgjbbachggggbjii","ijhbjfha","efbcghbagbiijhcgcj","efgdgeg","cbdfbcejddddiejfchjd","gefhabdgdfeehidf","giffa","g","jigjfidfhcfabhgi","ejhjfhghbcfffg","ihcecejfgg","gjgggihaedjfebgbab","idiaeejeaadj","cigciafhcjihbbagd","daahg","jddifffjibgjb","dbgdigbbdege","debdhcjgeehaafdaag","echhggeajafefhfhg","ihgcgfdiagdbhfic","ghdhgfjfgiagidfjbjce","gibaaf","iagajiahjhafiec","heg","jifedfe","faadahhaeiaebfa","bfafbefbbgdeah","cjfjfe","dejafddhaghb","fdbhjjacijj","bcjbfdcfjcagcbiaj","igeg","hgabjeffcijjbhehea","gh","fdfhhj","hhbbhceaeccbdgf","gdbdafbhgeagdhbe","fiehjfdg","hdghhjgggehgfcdcibi","gdcbcd","ccacfe","igfieb","cadggeagjbdccacgegj","bgdbjbdbegdgifh","ahga","fiagjahchcbdcbbbb","hdebdidifgiicj","efeiadihdfiijbbhah","afdeigcc","hjhefjfgfiihaj","hec","faabebbdjhicdhaab","iccchhijgcefgjghfb","aghehcbjbfb","agfdif","bdiijgfhhddjcegaehe","f","fhfjiijegbdcdibacc","bhcfcb","fdfhagd","cgfggghdbcahfdcbffii","bcdajbachdebaffijhhg","jbhagh","jcdjjaaehgddafiec","bibjc","baecdgifjjbic","geiahghbfege","a","dd","ecfhfeb","caijcghb","hgfcaejicjijgihidbj","iaghfgabehfje","ffjahgjgebfbfbigiih","gbecibgfgagah","jd","fbefdjfg","fhhdbfadfajaadcd","jf","hdjec","dbjecjedjdjfdcc","ih","bdhfbfgdcjgfh","dicbgacjeigbi","cddgfhge","aadafgbbbibc","ga","hbgjacecfahgeagghi","gjedafcigcbahacjagb","jgdcaijbgdci","fhhcfh","iabhf","ghfddagbhhdgbbj","caffddgeciahhgegidjf","ceageaidaieijehiia","ghejgdcehjcg","jbibdbjjejdi","ihafehfcff","ibfgd","ajeidijefecaeied","ceccffecehfihg","geidh","fcdgdeihecehdcf","gia","jjjahfdiajbfjfibh","hhi","aiidgibccecdgag","ecjecgjghe","agfhg","egibegj","hicfdcjidda","gdjaeeciaeiijhj","eajjgcejeigbehj","eii","hgedehfd","ijecbbcaebibfeiedie","baaecgfigecbg","eacabihif","ciechhfgcebfjiddbj","jeggedahfijieefehhhb","cgaagbafj","cifecafidcjc","dh","acbcccdjcgehbf","gabd","cehaaaibhge","hgeicaiaheceecjdh","dhgafa","acachjdahegdehhhjce","gfcfffifc","baehbagcfjidf","iefhefibfhiagfhjigi","ddbff","cbdhhgaiaicdfgdceijj","igfhjiicciahhgc","bddciecbfgd","djdbfhhhiiggbffjdah","aiajgdjdic","jdfebicedjjfb","abcghaaef","jjaafijhdgechfbjdacg","abhebjj","ibfiajcbjgjgiehf","fegfbdgbefgajaba","hba","aijigjjajbi","acebghfejjgadfcfd","baejiddfd","ibccejb","fchjibgfgdgcccbdiiba","hghbeggdjiaebd","gjadjehabcjh","igfghcjicc","hdeih","efhdhecbfg","ifjbfbhfbfg","jfeedficjbbei","dibjdbjg","diaigje","hd","afbd","iedbdfc","bih","ficaebjfj","ddhcjhcbichf","hhjijacededfib","efigbhacgebgicbjfdf","gighiijjdjibf","ebehbdbjdcj","jihf","bjiihijdeh","ibhbcjaicag","eaihhgaajifecihacb","c","djbjhgdacd","jdhdigeaggigidg","hifhfafaidebehgj","dge","hcaaifieddcbhh","dfahhcjf","bjdggigf","baicghahbjcgbacgiaf","iaceaaaaacj","fjajicg","edhhadafcdfh","ddfiiaiffegcajjcai","dfcae","cfajhadccahh","hih","fgdhbjfcaadfjggdbgij","df","dbagdcceaf","abehcghbhdfhaahif","ic","jggafjhheeedaffice","gcdfjchhfjbiifcjbie","fahgedjaedggaffgcg","jefbad","cda","gijbhcbibicbbgh","dia","eajcedgjejfcid","ccjdhcfageggcc","fgefjhcaeceahfbag","aeifefjghfe","fjjc","afiiaigdafiggj","hhagciahgafecdeb","jgjaf","jiefgab","gdecijh","iaejf","abgfbgfdgfhg","eiaha","dheecf","hdbhcdjaajfifeehbhaj","ijbebi","ffhfahb","ifhfcafahg","igeedbhjhgjdfbhaie","aahjceee","fbjacifgcbae","abffeafgbjidiacigcbi","gbdhc","bgjeeicfdejhddfeb","hgdjaeedced","jegabegajhjdhbhjchc","cegagchihaebca","bf","ichaedbhjgifjc","eihcafeccegh","ifacjhbcfef","hgghaghah","ejgagghcgifceg","iiedjjibdehhcebch","edeeff","behj","ee","fedgjaibd","jfjjjecefgebeaij","iabafiij","dcbjafbjiibiiieegfff","aeiehbhejegbfiiiehf","gahhjg","edhiagejaaaccdch","ibifchfieegbc","ighdibbigbgb","dacjbbjc","cehiciijhjgded","ecgbfe","bjfi","dcjcgbjdgegbjfdajbe","bgacaaccjachggeae","biceghffcibcbdiajfhd","fddeac","hgbgiihgdjbidijdjdeh","ajagaffehehjijgii","cj","cfieaae","dbhjjhh","hha","begiaibefe","aehecefcbajd","jejdchciidcifgabja","baebgbbedfdidf","aaifafefaa","hidic","adfjgeia","fbfhedagje","ajhfdjeifae","djaafhjeg","fhej","ffjdfjhfffjddfh","bfhejfjjfijdabfffhe","hecejcjfcgfia","dhefgbifggcjbbb","hiedeaca","cfaicah","djabb","eefbjhbcedgddffaibe","fagdfcghibejjceeeaf","gg","gdd","bhahcjjaifchheadjjb","fdg","hcdhb","fhejdcgcaafcc","fhjajgheaagg","gaefacci","iejabagigadgef","jhfaijhjadejghhbhcb","cgjg","afah","agbeifigjjgge","iiehhfiejadijaecichh","e","aegdichiabcggcgifad","ieadcfjdeghfdh","fajbhbejfba","ihdigidgibdcabbheb","jffddha","iebeif","hbcdd","dbcgaehecjjcd","gjafcdiagfbbhjheghh","iihjbeghfegghghjjb","gaidfhggfjgghcbfi","dfgbeehcdhdcidgdgig","dja","bfebchdjhj","jjibbgg","gcbifdfcjbcjdjjc","ddjigfjacdfjcbdci","ecahacbhfb","baf","cidbfajegaahhidgde","ffd","cihddbbheji","jhachgaggdffadafe","defa","de","bffbbigfa","ifbifca","fcccbedgffjecbddej","eddce","ecihdgei","gijbffjiabhhfgifa","eagiddhgicaehagccj","eciadh","ddjgddce","dgia","eifgaebjhcf","baceefhigiheeebbg","fcijiciahd","bdjg","ccbabi","cabedbhfgbfjcj","gggcjcf","ehbefahecgjfdfba","hccifbffbabfggddcjdi","jhigcjhfegefcjffhhh","bdfjgjb","cagcaih","jhhgdfabfffdbfc","djdigbhhgagidbi","ibibhbheahbdif","hceejhgibedhaicjfd","eah","gffidcffbbccijia","degaddhiaafbfcj","jb","hcfigabi","bjgfdfahefaaaja","fgechigaecaaj","hjgffgibciciaaed","gdihjbhcfjeff","hhbba","ha","bibedaiiiheadfja","aagjafahc","cjjeaeefigbfadd","ffejeeccgfgjbedb","cabceag","jegiabbf","eccjiidaiidc","cgjf","cbbhdffi","efcgiacabadjgiac","ije","ijjababfffahbea","dfgdeifjffjeacebaagg","eajgaj","ejhjcgfejbc","bjihg","ebdefefjj","iecjggbgc","dcicdhcbai","ccahaefafjebha","iacgffacb","fbiadfciagbefehdahcf","jbffffibebhbigea","ajehbeaaiheeah","afgfgcbafjfceggai","fffhfhhb","aejjac","adaheadjhhjgieba","fga","chhahaifiaifgdhejf","jgiciahbfid","ifchdjbcjachf","gfjgbfadggfdhdifjgbe","jbegfeeddih","hicbbedceeghfihjegha","ceabfiiddcdcgh","ffbgcigieiebff","diffdachhf","cdhb","deadeaddejif","ebgdgdhai","dj","fieijggicedec","accdihgdheiejdgaif","eddiaciddecjai","fdaibgi","echfcfcgjihhheihaf","egjhgiccchfed","fcfgahgijjfhdiajg","bddfddahjib","bdjjhcdjhbggf","ddgcccihb","gbejhabaedjehaaic","fjaicjijfcidhegie","ehiahijjgfigddbbehe","dcebd","bddchjcidffdffaagh","jchcajiffhgaahd","bcefifhbdcichjd","jfhai","adgag","cdgccjfjjdjajb","jcdchdbahddbgfaheja","aah","bh","jfjeeigc","ch","egg","ghjhajfjih","ibajgd","fhdjidbcgiabfcded","bidbjeffaafhdeha","jcaibccjhcfdfjdfafg","dhddhdcdfaiffjcgdfea","cjbabajccigicddchj","afdbgcff","cdbcfjhgcihcbgfieghg","jecbghgafefgbdg","cdfi","cggib","fbcidbbiejbdfhcdgbii","fdiabfaiccdeebahge","icecchbidacede","jcbfgbgjghdaebiggfe","jji","fhaca","dedfecdgfjb","aebbeeif","hddgfjh","iebfgajeehjaeegc","acfbihagejccf","jbdhfdbdcgjhdfjg","jdjbhbfibff","iijija","gjihjegghj","iedabdaifb","adfbcgagdfibahdiice","ibeihjjbhffehj","gaiagjgie","beehjcfegcghejhdf","ejgaiafejgdfi","fheiachbejggbe","jhbdfebda","gighhehjebhbib"}
;
		
//		String words[] = {"abcd", "dcba", "lls", "s", "sssll"};
		
		long startTime =  System.currentTimeMillis();
		List<List<Integer>> answer = palindromePairs(words);
		long endTime =  System.currentTimeMillis();
		
		System.out.println(answer);
		
		System.out.println("Time " + (endTime - startTime));
		System.out.println("COUNTER " + counter);
//		System.out.println(isPalindrom("fh", "jihf"));
		
		
	}
	
	public static List<List<Integer>> palindromePairs(String[] words) 
	{
		int  k = 0;
	    List<List<Integer>> answer = new ArrayList<List<Integer>>();
	        
	    for (int i = 0; i < words.length; i++) 
	    {
	    	for (int j = 0; j < words.length; j++) 
	    	{
	    		
    			if( i != j && isPalindrome(words[i] , words[j]))
    			{
    				List<Integer> inner   = new ArrayList<>();
    				inner.add(0,i);
    				inner.add(1, j);
    				answer.add(k , inner);
    				k++;	    				
    			}	    			
			}
		}   
	    return answer;    
	}

	private static boolean isPalindrome(String string, String string2)
	{
		boolean answer = true;
		int len1 = string.length();
		int len2 = string2.length();
		
		if(len1 == len2)
		{
			for (int i = 0; i < len1; i++) 
			{
				if(string.charAt(i) != string2.charAt(len2-1-i) )
				{
					return false;
				}
			}
		}
		else if(len1 > len2)
		{
			for (int i = 0; i < len2; i++)
			{
				if(string.charAt(i) != string2.charAt(len2-1-i) )
				{
					return false;
				}
			}
			
			int x = 0;
			for (int k = len2 ; k < len2 + ((len1 - len2)/2)  ; k++)
			{
				if(string.charAt(k) != string.charAt(len1-1-x))
				{
					return false;
				}
				x++;
			}
		}
		else
		{
			for (int i = 0; i < len1; i++)
			{
				if(string.charAt(i) != string2.charAt(len2-1-i) )
				{
					return false;
				}
			}
			
			
			for (int i = 0; i < (len2 - len1) / 2; i++)
			{
				if(string2.charAt(i) != string2.charAt(len2 - 1 - len1 - i))
				{
					return false;
				}
			}
		}
		counter++;
		return answer;
	}

	
//	 public static boolean isPalindrome(String word1, String word2) {
//	        int i = 0;
//	        int j = word2.length() - 1;
//	        while (i < word1.length() && j >= 0) {
//	            if (word1.charAt(i) != word2.charAt(j)) {
//	                return false;
//	            }
//	            i += 1;
//	            j -= 1;
//	        }
//	        if (word1.length() < word2.length()) {
//	            i = 0;
//	            while (i < j) {
//	                if (word2.charAt(i) != word2.charAt(j)) {
//	                    return false;
//	                }
//	                i += 1;
//	                j -= 1;
//	            }
//	        } else if (word1.length() > word2.length()) {
//	            j = word1.length() - 1;
//	            while (i < j) {
//	                if (word1.charAt(i) != word1.charAt(j)) {
//	                    return false;
//	                }
//	                i += 1;
//	                j -= 1;
//	            }
//	        }
//	        return true;
//	    }


	
}
