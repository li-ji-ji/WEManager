// pages/ElectPriceSet/ElectPriceSet.js
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

  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

    var that = this
    wx.request({
      url: host + '/config/getAbleByKey', //仅为示例，并非真实的接口地址
      data: {
        configKey: '电价(元/度)'
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        console.log(res.data)
        that.setData({
          waterConfig: res.data
        })
      }
    })
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
  getConfigData: function (e) {
    var that = this
    var configValue = e.detail.value
    that.setData({
      configValue: configValue
    })
  },
  submitPrice: function () {
    var that = this
    wx.request({
      url: host + '/config/setElectPrice', //仅为示例，并非真实的接口地址
      data: {
        configKey: '电价(元/度)',
        price: that.data.configValue
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        // console.log(res.data)
        if (res.data == 1) {
          wx.showToast({
            title: '电价修改成功',
            icon: 'success',
            duration: 1000
          })
        } else if (res.data == 0) {
          wx.showToast({
            title: '电价修改失败',
            icon: 'loading',
            duration: 1000
          })
        }
      }
    })
  },
})