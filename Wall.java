import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure, CompositeBlock {
    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    public List<Block> getBlocks() {
        return this.blocks;
    }

    @Override
    public int count() {
        return blocks.size();
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        Block blockByColor = blocks.stream()
            .filter((Block block) -> block.getColor().equals(color))
            .findFirst()
            .orElse(null);
        return Optional.ofNullable(blockByColor);
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> blocksByMaterial = blocks.stream()
            .filter((Block block) -> block.getMaterial().equals(material))
            .toList();
        return blocksByMaterial;
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Unimplemented method 'getColor'");
    }

    @Override
    public String getMaterial() {
        throw new UnsupportedOperationException("Unimplemented method 'getMaterial'");
    }

    public static void main(String[] args) {
        List<Block> blocks = new ArrayList<Block>();
        
        blocks.add(new Block(){
            @Override
            public String getColor() {
                return "blue";
            }
            public String getMaterial() {
                return "jeans";
            }
        });

        blocks.add(new Block(){
            @Override
            public String getColor() {
                return "green";
            }
            public String getMaterial() {
                return "cotton";
            }
        });

        blocks.add(new Block(){
            @Override
            public String getColor() {
                return "orange";
            }
            public String getMaterial() {
                return "cotton";
            }
        });

        Wall wall = new Wall(blocks);

        System.out.println("Wall class getBlocks() size = "  +  wall.getBlocks().size());
        System.out.println("Wall class findBlockByColor() blue = "  +  wall.findBlockByColor("blue").isPresent());
        System.out.println("Wall class findBlockByColor() white = "  +  wall.findBlockByColor("white").isPresent());
        System.out.println("Wall class findBlocksByMaterial() jeans = "  +  wall.findBlocksByMaterial("jeans").size());
        System.out.println("Wall class findBlocksByMaterial() cotton = "  +  wall.findBlocksByMaterial("cotton").size());
        System.out.println("Wall class findBlocksByMaterial() polyester = "  +  wall.findBlocksByMaterial("polyester").size());
    }
}