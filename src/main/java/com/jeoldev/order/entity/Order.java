package com.jeoldev.order.entity;

import com.jeoldev.order.dto.FoodItemDTO;
import com.jeoldev.order.dto.Restaurant;
import com.jeoldev.order.dto.UserDTO;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("order")
public class Order {

    private Long orderId;
    private List<FoodItemDTO> foodItemsList;
    private Restaurant restaurant;
    private UserDTO userDTO;

}
