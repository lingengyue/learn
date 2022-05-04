package designpattern.builder;

/**
 * 建造者模式
 */
public class HouseBuilder {

    public static void main(String[] args) {
        HouseBuilder builder = new HouseBuilder();
        builder.asBase("钢铁地基").asWall("木强").asRoof("平顶");
        System.out.println(builder.build());
    }

    String base;

    String wall;

    String roof;

    public HouseBuilder asBase(String base) {
        this.base = base;
        return this;
    }

    public HouseBuilder asWall(String wall) {
        this.wall = wall;
        return this;
    }

    public HouseBuilder asRoof(String roof) {
        this.roof = roof;
        return this;
    }

    House build() {
        House house = new House();
        house.setBase(base);
        house.setWall(wall);
        house.setRoof(roof);
        return house;
    }
}

class House {
    private String base;

    private String wall;

    private String roof;

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public String toString() {
        return "House{" +
                "base='" + base + '\'' +
                ", wall='" + wall + '\'' +
                ", roof='" + roof + '\'' +
                '}';
    }
}
