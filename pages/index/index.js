//index.js
//获取应用实例
var app = getApp();
var host = app.globalData.host;
Page({
  data: {
    host: host,
    windowWidth: wx.getSystemInfoSync().windowWidth,
    windowHeight: wx.getSystemInfoSync().windowHeight,
    navList:[],
  },

  onLoad: function () {
    var that=this
    wx.request({
      url: host+'/nav/getAll', //仅为示例，并非真实的接口地址
      data:'',
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        console.log(res.data)
        that.setData({
          navList:res.data
        })
      }
    })
  },

  navToPage:function(e){
    // console.log(e.currentTarget.dataset['url'])
    wx.navigateTo({
      url: e.currentTarget.dataset['url'],
      events: {
        // 为指定事件添加一个监听器，获取被打开页面传送到当前页面的数据
        acceptDataFromOpenedPage: function (data) {
          console.log(data)
        },
        someEvent: function (data) {
          console.log(data)
        }
      }
    })
  }


})
