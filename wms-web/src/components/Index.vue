<template>
<el-container style="height: 100%; border: 1px solid #eee">
<el-aside width="200px" style="background-color: rgb(238, 241, 246);height: 100%">
   <Aside>
   </Aside>
</el-aside>

<el-container style="height: 100%">
  <el-header style="text-align: right; font-size: 12px">
    <Head></Head>
  </el-header>

  <el-main>
    <Main></Main>
  </el-main>
</el-container>
</el-container>
</template>
<style>
.el-main{
  padding: 5px;
}
.el-header {
  background-color: #B3C0D1;
  color: #333;
  line-height: 60px;
}

.el-aside {
  color: #333;
}
</style>

<script>
import Aside from "@/components/Aside.vue";
import Head from "@/components/Head.vue";
import Main from "@/components/Main.vue";
export default {
  components: {Head, Aside,Main},

};
</script>