# BlockStructure
1. Klasa implementująca interfejs Structure poprawnie potrzebuje implementować trzy metody:
- Optional<Block> findBlockByColor(String color);
- List<Block> findBlocksByMaterial(String material);
- int count();
2. Dodatkowo klasa implementująca interfejs CompositeBlock, oprócz zaimplementowania metody List<Block> getBlocks(),
będzie potrzebować nadmiarowo zaimplementować obydwie metody z rozszerzanego interfejsu Block: String getColor() i String getMaterial().
Dlatego bardziej wskazaną definicją interfejsu CompositeBlock byłoby 
interface CompositeBlock {
List<Block> getBlocks();
}
3. Metoda Optional<Block> findBlockByColor(String color) implementowana w klasie Wall przeszukuje listę zapisaną w zmiennej blocks i zwraca dowolny element o podanym kolorze
4. Metoda List<Block> findBlocksByMaterial(String material) implementowana w klasie Wall przeszukuje listę zapisaną w zmiennej blocks i zwraca wszystkie elementy z danego materiału
5. Metoda int count() implementowana w klasie Wall zwraca liczbę wszystkich elementów tworzących strukturę zapisaną w zmiennej blocks
6. Testy w metodzie public static void main(String[] args) prezentują działanie metod implementowanych interfejsów Structure i CompositeBlock
