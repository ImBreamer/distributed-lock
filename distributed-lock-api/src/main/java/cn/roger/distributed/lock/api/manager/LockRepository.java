package cn.roger.distributed.lock.api.manager;

import java.util.concurrent.locks.Lock;

public interface LockRepository {

    /**
     * 新增path
     *
     * @param path path
     * @return 新增数量
     */
    Lock create(String path);

    /**
     * 新增path
     *
     * @param path path
     * @return 新增数量
     */
    Lock create(String path, String s);

    /**
     * 更新事务
     *
     * @param path 事务
     * @return 更新数量
     */
    int update(String path);

    /**
     * 删除事务
     *
     * @param path 事务
     * @return 删除数量
     */
    int delete(String path);

}
