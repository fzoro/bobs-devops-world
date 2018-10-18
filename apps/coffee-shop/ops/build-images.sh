#!/bin/bash
docker build --rm -t coffee-shop/coffee-shop-ui ../coffee-shop-ui/
docker build --rm -t coffee-shop/coffee-shop-bff ../coffee-shop-bff/
docker build --rm -t coffee-shop/inventory ../inventory/