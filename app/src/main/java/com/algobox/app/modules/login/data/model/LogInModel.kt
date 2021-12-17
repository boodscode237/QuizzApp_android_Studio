package com.algobox.app.modules.login.`data`.model

import com.algobox.app.R
import com.algobox.app.appcomponents.di.MyApp
import kotlin.String

public data class LogInModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogInwithGoo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_log_in_with_goo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmailAddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_email_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup76Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etGroup77Value: String? = null
)
