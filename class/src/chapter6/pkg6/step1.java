package chapter6.pkg6;
public class step1 {
    public static void main(String [] args){
        String str1=new String();//定义一个空字符串
        String str2=new String("ABCD");//定义一个内容为ABCD的字符串
        char[] charArray=new char[] {'E','F','G'};
        String str3=new String(charArray);//定义一个内容为字符数组的字符串
        String str4="hello";
        System.out.println(str1+str2+str3+str4);
        System.out.println("---------------------");
        String s="ababcdedcba";
        System.out.println(s);
        System.out.println("字符串的长度为："+s.length());
        System.out.println("字符c第一次出现的位置："+s.indexOf('c'));
        System.out.println("字符c最后一次出现的位置："+s.lastIndexOf('c'));
        System.out.println("子字符串第一次出现的位置："+s.indexOf("ab"));
        System.out.println("子字符串最后一次出现的位置："+s.lastIndexOf("ab"));
        System.out.println(s.charAt(2)) ;
        System.out.println("---------------------");
        String str="abcd";
        str=str.toUpperCase();//小写转为大写
        System.out.println(" 将字符串转为字符数组");
        char []charArray1=str.toCharArray();
        for(char x:charArray1) System.out.println(x);
        System.out.println("---------------------");
        double d=1.5; int i=2; float f=3.5f;
        System.out.println(d+i+f);
        System.out.println(String.valueOf(d)+String.valueOf(i) +String.valueOf(f));//数字转为字符串
        String str5="itcast";
        System.out.println("将it替换成cn.it: "+str5.replace("it","cn.it"));
        str5=" i t c a s t "; System.out.println("去除字符串两端空格："+str5.trim());
        System.out.println("去除字符串中所有空格："+str5.replace(" ",""));
        String s1="String";
        System.out.println("---------------------");
        System.out.println("判断是否以字符串Str开头:"+s1.startsWith("Str"));
        System.out.println("判断是否以字符串ng结尾："+s1.endsWith("ng"));
        System.out.println("判断是否包含字符串tri："+s1.contains("tri"));
        System.out.println("判断字符串是否为空："+s1.isEmpty());
        System.out.println("---------------------");
        String s3="abc";
        String s4="abc";
        System.out.println(s3==s4);//比较的是地址
        System.out.println(s3=="abc");//比较的是地址
        System.out.println("判断两个字符串是否相等："+s3.equals(s4));//比较的是值
        System.out.println("---------------------");
        String s5="羽毛球-篮球-乒乓球";
        System.out.println(s5.substring(4));
        System.out.println(s5.substring(4,6));
        String []strArray=s5.split("-");
        for(String x:strArray) System.out.print(x);
        System.out.println("---------------------");
        StringBuffer hc=new StringBuffer();//定义一个字符串缓冲区
        hc.append("abcdefg");//
        System.out.println("在末尾添加字符串"+hc);
        hc.insert(2, "123");
        System.out.println("在指定位置插入字符串"+hc);
        hc.delete(1,4);
        System.out.println("指定范围删除(1-3)"+hc);
        hc.deleteCharAt(2);
        System.out.println("指定位置删除"+hc);
        hc.delete(0,hc.length());//?
        System.out.println(hc);
        System.out.println("---------------------");
        // hc="abcdefg";//报错
        hc.append("abcdefg");
        System.out.println("在末尾添加字符串"+hc);
        hc.setCharAt(1,'p');
        System.out.println("替换指定位置字符"+hc);
        hc.replace(1,3,"qq");//替换指定位置(start~end-1)字符串或字符
        System.out.println("替换指定位置1-2字符串或字符"+hc);
        hc.reverse();
        System.out.println("字符翻转"+hc);
    }
}