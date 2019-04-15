package com.jrx.controller;

import com.jrx.model.TransactionItem;
import com.jrx.pojo.Result;
import com.jrx.pojo.Status;
import com.jrx.service.TransactionItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * TransactionItem的controller
 *对TransactionItem表进行操作
 * @author Administrator
 * @create 2019-04-15 18:38
 * @className TransactionItemController
 **/
@RequestMapping("/transactionItem")
@RestController
@Api(description = "TransactionItem的Controller访问API")
public class TransactionItemController {

    Logger logger = LoggerFactory.getLogger(com.jrx.controller.TransactionItemController.class);
    @Autowired
    private com.jrx.service.TransactionItemService TransactionItemService;

    @ApiOperation(value = "获取所有TransactionItem对象",notes = "获取所有TransactionItem",response = Result.class)
    @RequestMapping(value = "/listTransactionItem",method = RequestMethod.GET)
    public Result<List> listTransactionItem(){
        try {
            List<TransactionItem> TransactionItemList = TransactionItemService.listTransactionItem();
            return new Result<List>(Status.SUCCESS,"查询成功",TransactionItemList);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new Result<List>(Status.FAIL,"查询失败");
        }
    }

    @ApiOperation(value = "获取一个TransactionItem对象",notes = "传入transId获取一个TransactionItem",response = Result.class)
    @ApiImplicitParam(required = true,dataTypeClass = Integer.class,name="cusId",value = "传入transId获取TransactionItem对象")
    @RequestMapping(value = "/getTransactionItem/{transId}",method = RequestMethod.GET)
    public Result<TransactionItem> getTransactionItem(@PathVariable Integer transId){
        try {
            TransactionItem TransactionItem = TransactionItemService.getTransactionItem(transId);
            return new Result<TransactionItem>(Status.SUCCESS,"查询成功",TransactionItem);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new Result<TransactionItem>(Status.FAIL,"查询失败");
        }
    }

    @ApiOperation(value = "修改TransactionItem对象",notes = "传入TransactionItem对象修改TransactionItem",response = Result.class)
    @ApiImplicitParam(required = true,dataType = "TransactionItem",name="TransactionItem",value = "传入TransactionItem修改TransactionItem对象")
    @RequestMapping(value = "/updateTransactionItem",method = RequestMethod.PUT)
    public Result updateTransactionItem(@RequestBody TransactionItem TransactionItem){
        try {
            TransactionItemService.updateTransactionItem(TransactionItem);
            return new Result(Status.SUCCESS,"修改成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new Result(Status.FAIL,"修改失败");
        }
    }

    @ApiOperation(value = "添加TransactionItem对象",notes = "传入TransactionItem对象添加TransactionItem",response = Result.class)
    @ApiImplicitParam(required = true,dataType = "TransactionItem",name="TransactionItem",value = "传入TransactionItem添加TransactionItem对象")
    @RequestMapping(value = "/insertTransactionItem",method = RequestMethod.POST)
    public Result<TransactionItem> insertTransactionItem(@RequestBody TransactionItem TransactionItem){
        try {
            TransactionItemService.updateTransactionItem(TransactionItem);
            return new Result<TransactionItem>(Status.SUCCESS,"添加成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new Result<TransactionItem>(Status.FAIL,"添加失败");
        }
    }

    @ApiOperation(value = "删除TransactionItem对象",notes = "传入transId删除TransactionItem对象",response = Result.class)
    @ApiImplicitParam(required = true,dataTypeClass = Integer.class,name="sIndex",value = "传入transId删除TransactionItem对象")
    @RequestMapping(value = "/deleteTransactionItem/{transId}",method = RequestMethod.DELETE)
    public Result deleteTransactionItem(@PathVariable Integer transId){
        try {
            TransactionItemService.deleteByTansId(transId);
            return new Result(Status.SUCCESS,"删除成功");
        } catch (Exception e) {
            logger.error(e.getMessage());
            return new Result(Status.FAIL,"删除失败");
        }
    }
}
