package com.mairuis.raft;

/**
 * 抽象出状态机层
 *
 * @author Mairuis
 * @since 2020/8/4
 */
public interface StateMachine {

    /**
     * 将一个状态应用到状态机上
     *
     * @param request
     * @return 状态机响应结果
     */
    byte[] applyState(byte[] request);

}
