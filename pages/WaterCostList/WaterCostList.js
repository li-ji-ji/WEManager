// pages/WaterCostList/WaterCostList.js
var app = getApp();
var host = app.globalData.host;
Page({

  /**
   * 页面的初始数据
   */
  data: {
    host: host,
    windowWidth: wx.getSystemInfoSync().windowWidth,
    windowHeight: wx.getSystemInfoSync().windowHeight,
    waterRecord: [],
    checkBtn: [
      {
        color: '#00D8A0',
        title: '待缴(本月)',
        api: '/water/getUnCostRecordThisMonth',
        arrow: true
      },
      {
        color: '',
        title: '已缴(本月)',
        api: '/water/getCostedRecordThisMonth',
        arrow: false
      },
      {
        color: '',
        title: '待缴(历史)',
        api: '/water/getUnCostRecord',
        arrow: false
      },
      {
        color: '',
        title: '缴费记录',
        api: '/water/getRecordThisMonth',
        arrow: false
      }
    ],
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this
    wx.request({
      url: host + '/water/getRecordThisMonth', //仅为示例，并非真实的接口地址
      data: '',
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        // console.log(res.data)
        that.setData({
          waterRecord: res.data
        })
      }
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },
  //导航栏点击获取列表
  getList: function (res) {
    var that = this
    wx.request({
      url: host + res.detail.url,
      data: {
        stuId: this.data.stuId
      },
      header: { 'content-type': 'application/json' },
      method: 'GET',
      dataType: 'json',
      success: function (res) {
        //console.log(res.data)
        that.setData({
          waterRecord: res.data
        })
      }
    })
  }
})