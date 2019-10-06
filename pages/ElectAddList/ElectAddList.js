// pages/ElectAddList/ElectAddList.js
var app = getApp();
var host = app.globalData.host;
const query = wx.createSelectorQuery();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    host: host,
    windowWidth: wx.getSystemInfoSync().windowWidth,
    windowHeight: wx.getSystemInfoSync().windowHeight,
    houseList: []
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var that = this
    wx.request({
      url: host + '/house/getHouseholderAll', //仅为示例，并非真实的接口地址
      data: '',
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        console.log(res.data)
        that.setData({
          houseList: res.data
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
  addRecorda: function (e) {
    var that = this
    var value = e.detail.value
    var houseId = e.currentTarget.dataset['houseId']
    that.setData({
      [houseId]: value
    })
  },
  addRecord: function (e) {
    var that = this
    // console.log(e.currentTarget.dataset['houseId'])
    //获取门牌号
    var houseId = e.currentTarget.dataset['houseId']
    //根据门牌号获取data值
    var num = that.data[houseId]
    wx.request({
      url: host + '/elect/addByHouseIdAndThisNum', //仅为示例，并非真实的接口地址
      data: {
        houseId: e.currentTarget.dataset['houseId'],
        thisNum: num,
      },
      header: {
        'content-type': 'application/json' // 默认值
      },
      success(res) {
        // console.log(res.data)
        if(res.data==1){
          wx.showToast({
            title: '添加成功',
            icon: 'success',
            duration: 1000
          })
        } else if (res.data == 0) {
            wx.showToast({
              title: '添加失败',
              icon: 'loading',
              duration: 1000
            })
        }
      }
    })
  }
})