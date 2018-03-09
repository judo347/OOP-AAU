package problem11;

import java.util.ArrayList;

public class Dict<K, V> {
    private ArrayList<Pair<K, V>> array;

    public Dict() {
        array = new ArrayList<>();
    }

    public V get(K key){
        for(int i = 0; i < array.size(); i++){
            if(key == array.get(i).getValueA())
                return array.get(i).getValueB();
        }
        throw new IllegalArgumentException();
    }

    public void put(K key, V value){

        for(int i = 0; i < array.size(); i++){
            if(key == array.get(i).getValueA()){
                array.remove(i);
            }
        }

        array.add(new Pair<>(key, value));
    }
}
