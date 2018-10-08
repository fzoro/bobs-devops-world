module.exports = {
    log: "error",
    redis: {
        url: process.env.REDIS_URL
    },
    microservices:{
        inventory: {
            uri: "http://localhost:9090/inventory"
        }
    }
};