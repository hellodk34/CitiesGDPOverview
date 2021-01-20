import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author hellodk
 * @Description
 * @date 2020/5/15, 0015 上午 10:46
 */
class Cities {
    private Integer population;
    private Integer GDP;
    private String cityName;
    static int count = 0;

    public Cities() {

    }

    public Cities(Integer population, Integer GDP, String cityName) {
        this.population = population;
        this.GDP = GDP;
        this.cityName = cityName;
        count++;
    }

    public Integer getRenkou() {
        return population;
    }

    public void setRenkou(Integer population) {
        this.population = population;
    }

    public Integer getGDP() {
        return GDP;
    }

    public void setGDP(Integer GDP) {
        this.GDP = GDP;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        return "城市：" + this.cityName + " 人口：" + this.population + "万人 GDP: " + this.GDP + "亿元 人均GDP: " + String.format("%.2f", (double) this.GDP / this.population) + "万元";
    }
}

public class GDPCompare {

    public static void main(String[] args) {

        // 2017年的数据
        ArrayList<Cities> list2017 = new ArrayList();

        // 2018年的数据
        ArrayList<Cities> list2018 = new ArrayList<>();

        // 2019年的数据
        ArrayList<Cities> list2019 = new ArrayList<>();

        Cities city1 = new Cities(1090, 22286, "深圳");
        Cities city2 = new Cities(653, 10511, "无锡");
        Cities city3 = new Cities(1065, 17000, "苏州");
        Cities city4 = new Cities(1404, 21500, "广州");
        Cities city5 = new Cities(827, 11715, "南京");
        Cities city6 = new Cities(919, 12556, "杭州");
        Cities city7 = new Cities(765, 10200, "长沙");
        Cities city8 = new Cities(871, 11258, "青岛");
        Cities city9 = new Cities(2171, 28000, "北京");
        Cities city10 = new Cities(788, 9850, "宁波");
        Cities city11 = new Cities(2418, 30133, "上海");
        Cities city12 = new Cities(1077, 13400, "武汉");
        Cities city13 = new Cities(1547, 18595, "天津");
        Cities city14 = new Cities(846, 9500, "佛山");
        Cities city15 = new Cities(701, 7550, "烟台");
        Cities city16 = new Cities(730, 7750, "南通");
        Cities city17 = new Cities(700, 7363, "大连");
        Cities city18 = new Cities(706, 7285, "济南");
        Cities city19 = new Cities(832, 7580, "东莞");
        Cities city20 = new Cities(1001, 9003, "郑州");
        Cities city21 = new Cities(851, 7533, "泉州");
        Cities city22 = new Cities(1592, 13890, "成都");
        Cities city23 = new Cities(937, 7191, "合肥");
        Cities city24 = new Cities(945, 7206, "西安");
        Cities city25 = new Cities(3372, 19530, "重庆");


        Cities city26 = new Cities(1302, 24691, "深圳");
        Cities city27 = new Cities(1072, 18697, "苏州");
        Cities city28 = new Cities(657, 11438, "无锡");
        Cities city29 = new Cities(1490, 23000, "广州");
        Cities city30 = new Cities(843, 12820, "南京");
        Cities city31 = new Cities(791, 11527, "长沙");
        Cities city32 = new Cities(2154, 30320, "北京");
        Cities city33 = new Cities(980, 13500, "杭州");
        Cities city34 = new Cities(782, 10745, "宁波");
        Cities city35 = new Cities(2424, 32679, "上海");
        Cities city36 = new Cities(1108, 14847, "武汉");
        Cities city37 = new Cities(939, 12561, "青岛");
        Cities city38 = new Cities(790, 10550, "佛山");
        Cities city39 = new Cities(681, 8862, "济南");
        Cities city40 = new Cities(1560, 18809, "天津");
        Cities city41 = new Cities(669, 7825, "大连");
        Cities city42 = new Cities(731, 8427, "南通");
        Cities city43 = new Cities(712, 8006, "烟台");
        Cities city44 = new Cities(1013, 10200, "郑州");
        Cities city45 = new Cities(839, 8300, "东莞");
        Cities city46 = new Cities(870, 8467, "泉州");
        Cities city47 = new Cities(808, 7822, "合肥");
        Cities city48 = new Cities(1633, 15342, "成都");
        Cities city49 = new Cities(1000, 8349, "西安");
        Cities city50 = new Cities(3102, 20363, "重庆");

        Cities city51 = new Cities(2424, 38155, "上海");
        Cities city52 = new Cities(2171, 35371, "北京");
        Cities city53 = new Cities(1302, 26927, "深圳");
        Cities city54 = new Cities(1491, 23628, "广州");
        Cities city55 = new Cities(3372, 23605, "重庆");
        Cities city56 = new Cities(1071, 19235, "苏州");
        Cities city57 = new Cities(1633, 17012, "成都");
        Cities city58 = new Cities(1112, 16223, "武汉");
        Cities city59 = new Cities(1036, 15373, "杭州");
        Cities city60 = new Cities(1560, 14104, "天津");
        Cities city61 = new Cities(850, 14030, "南京");
        Cities city62 = new Cities(821, 11985, "宁波");
        Cities city63 = new Cities(658, 11852, "无锡");
        Cities city64 = new Cities(940, 11741, "青岛");
        Cities city65 = new Cities(1014, 11589, "郑州");
        Cities city66 = new Cities(816, 11574, "长沙");
        Cities city67 = new Cities(846, 10751, "佛山");
        Cities city68 = new Cities(870, 9946, "泉州");
        Cities city69 = new Cities(840, 9482, "东莞");
        Cities city70 = new Cities(883, 9443, "济南");


        list2017.add(city1);
        list2017.add(city2);
        list2017.add(city3);
        list2017.add(city4);
        list2017.add(city5);
        list2017.add(city6);
        list2017.add(city7);
        list2017.add(city8);
        list2017.add(city9);
        list2017.add(city10);
        list2017.add(city11);
        list2017.add(city12);
        list2017.add(city13);
        list2017.add(city14);
        list2017.add(city15);
        list2017.add(city16);
        list2017.add(city17);
        list2017.add(city18);
        list2017.add(city19);
        list2017.add(city20);
        list2017.add(city21);
        list2017.add(city22);
        list2017.add(city23);
        list2017.add(city24);
        list2017.add(city25);

        list2018.add(city26);
        list2018.add(city27);
        list2018.add(city28);
        list2018.add(city29);
        list2018.add(city30);
        list2018.add(city31);
        list2018.add(city32);
        list2018.add(city33);
        list2018.add(city34);
        list2018.add(city35);
        list2018.add(city36);
        list2018.add(city37);
        list2018.add(city38);
        list2018.add(city39);
        list2018.add(city40);
        list2018.add(city41);
        list2018.add(city42);
        list2018.add(city43);
        list2018.add(city44);
        list2018.add(city45);
        list2018.add(city46);
        list2018.add(city47);
        list2018.add(city48);
        list2018.add(city49);
        list2018.add(city50);

        list2019.add(city51);
        list2019.add(city52);
        list2019.add(city53);
        list2019.add(city54);
        list2019.add(city55);
        list2019.add(city56);
        list2019.add(city57);
        list2019.add(city58);
        list2019.add(city59);
        list2019.add(city60);
        list2019.add(city61);
        list2019.add(city62);
        list2019.add(city63);
        list2019.add(city64);
        list2019.add(city65);
        list2019.add(city66);
        list2019.add(city67);
        list2019.add(city68);
        list2019.add(city69);
        list2019.add(city70);

        System.out.println("------2017年数据 start------\n");

        // 按照 GDP 总量降序排序
        System.out.println("------按照 GDP 总量降序排序------");
        Collections.sort(list2017, new MyComparator2());
        foo(list2017);
        // 按照 人口数量排序
        System.out.println("\n------按照 人口总量 降序排序------");
        Collections.sort(list2017, new MyComparator3());
        foo(list2017);
        // 按照 人均 GDP 总量 降序排序
        System.out.println("\n------按照 人均 GDP 降序排序------");
        Collections.sort(list2017, new MyComparator1());
        foo(list2017);
        System.out.println("------2017年数据 end------\n");

        System.out.println("\n------2018年数据 start------\n");

        // 按照 GDP 总量降序排序
        System.out.println("\n------按照 GDP 总量降序排序------");
        Collections.sort(list2018, new MyComparator2());
        foo(list2018);
        // 按照 人口数量排序
        System.out.println("\n------按照 人口总量 降序排序------");
        Collections.sort(list2018, new MyComparator3());
        foo(list2018);
        // 按照 人均 GDP 总量 降序排序
        System.out.println("\n------按照 人均 GDP 降序排序------");
        Collections.sort(list2018, new MyComparator1());
        foo(list2018);
        System.out.println("------2018年数据 end------\n");

        System.out.println("\n------2019年数据 start------\n");
        // 按照 GDP 总量降序排序
        System.out.println("------按照 GDP 总量降序排序------");
        Collections.sort(list2019, new MyComparator2());
        foo(list2019);
        // 按照 人口数量排序
        System.out.println("\n------按照 人口总量 降序排序------");
        Collections.sort(list2019, new MyComparator3());
        foo(list2019);
        // 按照 人均 GDP 总量 降序排序
        System.out.println("\n------按照 人均 GDP 降序排序------");
        Collections.sort(list2019, new MyComparator1());
        foo(list2019);
        System.out.println("------2019年数据 end------");
    }

    // 将功能独立成一个方法，提高代码复用，在需要用的地方调用
    private static void foo(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print("第" + (i + 1) + "名：");
            System.out.println(list.get(i).toString());
        }
    }

    //根据人均贡献值降序排序
    private static class MyComparator1 implements Comparator<Cities> {
        @Override
        public int compare(Cities o1, Cities o2) {
            double temp = (double) o2.getGDP() / o2.getRenkou() - (double) o1.getGDP() / o1.getRenkou();
            if (temp > 0) {
                return 1;
            }
            else if (temp < 0) {
                return -1;
            }
            else return 0;
        }
    }

    //根据GDP总量降序排序
    private static class MyComparator2 implements Comparator<Cities> {
        @Override
        public int compare(Cities o1, Cities o2) {
            return o2.getGDP() - o1.getGDP();
        }
    }

    //根据人口数量总量降序排序
    private static class MyComparator3 implements Comparator<Cities> {
        @Override
        public int compare(Cities o1, Cities o2) {
            return o2.getRenkou() - o1.getRenkou();
        }
    }
}
