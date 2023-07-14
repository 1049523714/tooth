<template>
  <div>
    <full-calendar :events="monthData" class="test-fc"
                   first-day='1' locale="fr"
                   @changeMonth="changeMonth"
    @eventClick="eventClick"
    @dayClick="dayClick"
    @moreClick="moreClick"></full-calendar>
  </div>
</template>
<script>
import { fullCalendar } from 'vue-fullcalendar'
export default {

  data() {
    return {
      monthData: [

        {
          title : 'sssss',
          start : '2018-12-25',
          end : '2018-12-30',
          cssClass: 'blue'
        },
        {
          title : 'dddddddd',
          start : '2018-12-09',
          end : '2018-12-30',
          cssClass: 'blue'
        },
        {
          title : 'cccccc',
          start : '2018-12-20',
          end : '2018-12-30',
          cssClass: 'red'
        },
        {
          title : 'aaaaaa',
          start : '2018-12-01',
          end : '2018-12-30',
          cssClass: 'red'
        },
        {
          title : 'bbbbbb',
          start : '2018-12-05',
          end : '2019-1-10',
          cssClass: 'blue'
        }
      ]
    }
  },
  methods: {
    // 选择月份
    changeMonth (start, end, current) {
      console.log('changeMonth')
    },
    // 点击事件
    eventClick (event, jsEvent, pos) {
      console.log('eventClick', event, jsEvent, pos)
    },
    // 点击当天
    dayClick (day, jsEvent) {
      console.log('dayClick', day, jsEvent)
    },
    // 查看更多
    moreClick (day, events, jsEvent) {
      console.log('moreCLick', day, events, jsEvent)
    },
  },
  components: {
    'full-calendar': require('vue-fullcalendar')
  },}
</script>


<style>
.red {
  background: red;
}
.blue {
  background: blue;
}
</style>