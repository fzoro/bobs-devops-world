<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <button @click="getCoffeeInventory()">Show me the coffee(Async)!</button>
    <h3>{{ coffeeInventory }}</h3>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to the Coffee Shop app',
      coffeeInventory: ''
    }
  },
  methods: {
    getCoffeeInventory: async function () {
      let response = await axios.get(`${process.env.VUE_APP_BFF}/coffee`)
      this.coffeeInventory = response.data
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1 {
  font-weight: normal;
}
h3{
  color: darkgreen;
}
</style>
