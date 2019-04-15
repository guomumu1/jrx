package com.jrx.controller;

import com.jrx.model.TotalItemDaily;
import com.jrx.pojo.Result;
import com.jrx.pojo.Status;
import com.jrx.service.TotalItemDailyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * TotalItemDaily的controller
 *对TotalItemDaily对应的表进行操作
 * @author Administrator
 * @create 2019-04-15 18:32
 * @className TotalItemDailyService
 **/

@RequestMapping("/TotalItemDaily")
@RestController
@Api(description = "TotalItemDaily的Controller访问API")
public class TotalItemDailyController {
        Logger logger = LoggerFactory.getLogger(com.jrx.controller.TotalItemDailyController.class);
        @Autowired
        private TotalItemDailyService TotalItemDailyService;

        @ApiOperation(value = "获取所有totalItemDaily对象",notes = "获取所有totalItemDaily",response = Result.class)
        @RequestMapping(value = "/listTotalItemDaily",method = RequestMethod.GET)
        public Result<List> listTotalItemDaily(){
            try {
                List<TotalItemDaily> TotalItemDailyList = TotalItemDailyService.listTotalItemDaily();
                return new Result<List>(Status.SUCCESS,"查询成功",TotalItemDailyList);
            } catch (Exception e) {
                logger.error(e.getMessage());
                return new Result<List>(Status.FAIL,"查询失败");
            }
        }

        @ApiOperation(value = "获取一个TotalItemDaily对象",notes = "根据cusId获取一个TotalItemDaily",response = Result.class)
        @ApiImplicitParam(required = true,dataTypeClass = String.class,name="cusId",value = "传入sIndex获取TotalItemDaily对象")
        @RequestMapping(value = "/getTotalItemDaily/{sIndex}",method = RequestMethod.GET)
        public Result<TotalItemDaily> getTotalItemDaily(@PathVariable String sIndex){
            try {
                TotalItemDaily TotalItemDaily = TotalItemDailyService.getTotalItemDaily(sIndex);
                return new Result<TotalItemDaily>(Status.SUCCESS,"查询成功",TotalItemDaily);
            } catch (Exception e) {
                logger.error(e.getMessage());
                return new Result<TotalItemDaily>(Status.FAIL,"查询失败");
            }
        }

        @ApiOperation(value = "修改TotalItemDaily对象",notes = "传入TotalItemDaily对象修改TotalItemDaily",response = Result.class)
        @ApiImplicitParam(required = true,dataType = "TotalItemDaily",name="TotalItemDaily",value = "传入TotalItemDaily修改totalItemDaily对象")
        @RequestMapping(value = "/updateTotalItemDaily",method = RequestMethod.PUT)
        public Result updateTotalItemDaily(@RequestBody TotalItemDaily TotalItemDaily){
            try {
                TotalItemDailyService.updateTotalItemDaily(TotalItemDaily);
                return new Result(Status.SUCCESS,"修改成功");
            } catch (Exception e) {
                logger.error(e.getMessage());
                return new Result(Status.FAIL,"修改失败");
            }
        }

        @ApiOperation(value = "添加TotalItemDaily对象",notes = "传入TotalItemDaily对象添加TotalItemDaily",response = Result.class)
        @ApiImplicitParam(required = true,dataType = "TotalItemDaily",name="TotalItemDaily",value = "传入TotalItemDaily添加totalItemDaily对象")
        @RequestMapping(value = "/insertTotalItemDaily",method = RequestMethod.POST)
        public Result<TotalItemDaily> insertTotalItemDaily(@RequestBody TotalItemDaily TotalItemDaily){
            try {
                TotalItemDailyService.updateTotalItemDaily(TotalItemDaily);
                return new Result<TotalItemDaily>(Status.SUCCESS,"添加成功");
            } catch (Exception e) {
                logger.error(e.getMessage());
                return new Result<TotalItemDaily>(Status.FAIL,"添加失败");
            }
        }

        @ApiOperation(value = "删除TotalItemDaily对象",notes = "传入sIndex删除totalItemDaily对象",response = Result.class)
        @ApiImplicitParam(required = true,dataType = "String",name="sIndex",value = "传入sIndex删除totalItemDaily对象")
        @RequestMapping(value = "/deleteTotalItemDaily/{sIndex}",method = RequestMethod.DELETE)
        public Result deleteTotalItemDaily(@PathVariable String sIndex){
            try {
                TotalItemDailyService.deleteBySIndex(sIndex);
                return new Result(Status.SUCCESS,"删除成功");
            } catch (Exception e) {
                logger.error(e.getMessage());
                return new Result(Status.FAIL,"删除失败");
            }
        }

}
