package com.scossi.design.objectpool;

public class Main {

    public static void main(String[] args) {
        PooledObject pooledObject1 = PooledObjectPool.getObject();
        PooledObject pooledObject2 = PooledObjectPool.getObject();

        PooledObjectPool.releaseObject(pooledObject1);

        PooledObject pooledObject3 = PooledObjectPool.getObject();
        PooledObject pooledObject4 = PooledObjectPool.getObject();
    }
}
