<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <button @click="getCoffeeInventoryPromise()">Show me the coffee(Promise)!</button>
    <button @click="getCoffeeInventoryAsync()">Show me the coffee(Async)!</button>
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
    getCoffeeInventoryPromise: function () {
      axios
        .get('http://localhost:3000/coffee')
        .then(response => (this.coffeeInventory = response.data))
    },
    getCoffeeInventoryAsync: async function () {
      let response = await axios.get('http://localhost:3000/coffee')
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
