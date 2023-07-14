<template>
  <div id="app">
    <Main></Main>
  </div>
</template>

<script>
import Index from "@/components/Index.vue";
import Main from  "@/components/Main.vue";
export default {
  name: 'App',
  components: {
    Index,
    Main
  }
}
</script>

<style>
#app {
  height: 100%;
}
</style>
