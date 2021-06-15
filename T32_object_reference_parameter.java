public class T32_object_reference_parameter{
    public static void main(String[] args){
        Person p = new Person();
        String[] fullname = new String[] { "Homer", "Simpson" };//這是一個引用類型,和C語言的指針一樣
        p.setName(fullname); // 传入fullname数组
        System.out.println(p.getName()); // "Homer Simpson"
        fullname[0] = "Bart"; // fullname数组的第一个元素修改为"Bart",此時物件內的數組是指向這個數組,當原有的數組發生變化時,那物件內的也會受到影響
        System.out.println(p.getName()); // 所以物件內的this.name[0]就會變為"Bart"
    }
}
class Person {
    private String[] name;

    public String getName() {
        return this.name[0] + " " + this.name[1];//輸出頭+尾的姓名
    }

    public void setName(String[] name) {
        this.name = name;
    }
}
