public class T29_object_basic{//這也是一個類
    public static void main(String[] args){
        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
    }
}
class City{
    public String name;//名稱
    public Double latitude;//緯度
    public Double longitude;//經度
}