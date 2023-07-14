import Vue from 'vue';
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import App from './App.vue';
import './assets/global.css'
import FullCalendar from 'vue-fullcalendar'
Vue.use(FullCalendar)
Vue.use(ElementUI);
import VCalendar from 'v-calendar';

// Use v-calendar & v-date-picker components
Vue.use(VCalendar, {
  componentPrefix: 'vc',

});

new Vue({
  el: '#app',
  render: h => h(App)
});