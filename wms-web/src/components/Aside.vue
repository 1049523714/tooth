<script setup>

</script>

<template>
  <el-menu :default-openeds="['1', '3']">
    <el-submenu index="1">
      <template slot="title"><i class="el-icon-message"></i>导航</template>
      <el-menu-item-group>
        <template slot="title">预约信息</template>
        <el-menu-item index="1-1">日历展示</el-menu-item>
        <el-menu-item index="1-2">事件展示</el-menu-item>
      </el-menu-item-group>
      <el-menu-item-group title="信息管理">
        <el-menu-item index="1-3">医师信息管理</el-menu-item>
        <el-menu-item index="1-3">患者信息管理</el-menu-item>
        <el-menu-item index="1-3">预约信息管理</el-menu-item>
      </el-menu-item-group>

    </el-submenu>
  </el-menu>
</template>

<style scoped>

</style>