package co.lq.modules.shop.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import co.lq.base.BaseMapper;
import co.lq.modules.shop.domain.OrderReturnReason;
import co.lq.modules.shop.service.dto.OrderReturnReasonDTO;

/**
 * @author billy
 * @date 2020-03-27
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderReturnReasonMapper extends BaseMapper<OrderReturnReasonDTO, OrderReturnReason> {
}
