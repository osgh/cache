package tech.benice.cache;

import tech.benice.cache.exception.CacheException;

/**
 * <p>Title:缓存实例生命周期管理器</p>
 * <p>Description: </p>
 *
 * @author chao
 */
public interface CacheManager {

    /**
     * 获取指定缓存名的缓存实例，如果没有这个指定名，则生成这个指定名的缓存实例并返回
     *
     * @param name 缓存name
     * @param <K>
     * @param <V>
     * @return
     * @throws CacheException
     */
    <K, V> Cache<K, V> getCache(String name) throws CacheException;
}
