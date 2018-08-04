package InterfacesAndAbstraction.CollectionHierarchy.impl;

import InterfacesAndAbstraction.CollectionHierarchy.contracts.AddCollection;

import java.util.ArrayList;
import java.util.List;

public class AddCollectionImpl implements AddCollection {
    private List<String> collection;

    public AddCollectionImpl() {
        this.collection = new ArrayList<>();
    }

    protected List<String> getCollection() {
        return collection;
    }

    @Override
    public int add(String str) {
        this.collection.add(collection.size(), str);
        return this.collection.lastIndexOf(str);
    }
}
