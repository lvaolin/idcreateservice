package com.dhy.util.peakcut.spi;

import com.dhy.util.peakcut.TaskRequestDto;

/**
 * 结果管理器
 */
public interface TaskResultHandler {
    /**
     * 任务进入线程池之前的排队状态（初始化结果，更新状态为"排队中"）
     * @param requestDto
     * @return
     */
    Object initResult(TaskRequestDto requestDto);
    /**
     * 任务进入了线程池（更新结果状态为"处理中"）
     * @param requestDto
     * @return
     */
    Object beforeResult(TaskRequestDto requestDto);

    /**
     * 任务完成之后（结果回写，更新状态为"完成"）
     * @param requestDto
     * @param result
     * @return
     */
    Object afterResult(TaskRequestDto requestDto,Object result);

    /**
     * 任务发生异常后 （异常回写，更新状态为"异常"）
     * @param requestDto
     * @param exception
     * @return
     */
    Object exceptionResult(TaskRequestDto requestDto,Object exception);

    /**
     * 结果查询
     * @param taskRequestId
     * @return
     */
    Object queryResult(String taskRequestId);

    /**
     * 结果的清理释放
     * @param taskRequestId
     */
    void removeResult(String taskRequestId);
}
