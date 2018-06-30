package tech.benice.cache;

import tech.benice.cache.exception.CacheException;

import java.util.Collection;
import java.util.Set;

/**
 * <p>Title:缓存</p>
 * <p>Description: （key,value）</p>
 *
 * @author chao
 */
public interface Cache<K, V> {

    /**
     * 缓存的key-value数
     * @return
     */
    int size();

    /**
     * 取key的缓存值
     *
     * @param key
     * @return 若没有key返回null
     * @throws CacheException
     */
    V get(K key) throws CacheException;

    /**
     * 缓存key及value
     *
     * @param key key
     * @param value value
     * @return key的值
     * @throws CacheException
     */
    V put(K key, V value) throws CacheException;

    /**
     * 移除key及值
     *
     * @param key key
     * @return key的值
     * @throws CacheException
     */
    V remove(K key) throws CacheException;

    /**
     * 清空所有
     *
     * @throws CacheException
     */
    void clear() throws CacheException;

    /**
     * 所有缓存的key
     *
     * @return
     */
    Set<K> keys();

    /**
     * 所有缓存的value
     *
     * @return
     */
    Collection<V> values();

}
