package com.tiou.controller;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("a-bootiful-client")
public interface GreetingClient extends GreetingController{
}
