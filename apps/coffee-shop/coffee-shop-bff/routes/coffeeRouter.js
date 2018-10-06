var express = require('express');
var axios = require('axios');
var router = express.Router();
var config = require('../config');
router.get('/', async function(req, res, next) {
  let response 
  try{
    response = await axios.get('http://localhost:9090/inventory/coffee')
  }catch(e){
    return res.status(500).send()
  }
  res.send(response.data + ' -  passed by nodeJS BFF as well. redis.url=' + config.redis.url + 'redis.url='+ config.redis.port)
});

module.exports = router;