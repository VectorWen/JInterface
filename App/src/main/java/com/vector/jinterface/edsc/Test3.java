package com.vector.jinterface.edsc;

import java.util.List;

/**
 * author: vector.huang
 * date：2016/5/24 11:17
 */
public class Test3 {

    public static final String sql = "USE [KoudaiDBV19]\n" +
            "GO\n" +
            "/****** Object:  Table [dbo].[DDHK_ExhibitionType]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "SET ANSI_NULLS ON\n" +
            "GO\n" +
            "SET QUOTED_IDENTIFIER ON\n" +
            "GO\n" +
            "CREATE TABLE [dbo].[DDHK_ExhibitionType](\n" +
            "\t[Id] [bigint] IDENTITY(1,1) NOT NULL,\n" +
            "\t[Name] [nvarchar](250) NULL,\n" +
            "\t[OrderId] [int] NULL,\n" +
            "\t[BitFlag] [int] NULL,\n" +
            "PRIMARY KEY CLUSTERED \n" +
            "(\n" +
            "\t[Id] ASC\n" +
            ")WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]\n" +
            ") ON [PRIMARY]\n" +
            "GO\n" +
            "/****** Object:  Table [dbo].[DDHK_ExhibitionProperty]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "SET ANSI_NULLS ON\n" +
            "GO\n" +
            "SET QUOTED_IDENTIFIER ON\n" +
            "GO\n" +
            "CREATE TABLE [dbo].[DDHK_ExhibitionProperty](\n" +
            "\t[Id] [bigint] IDENTITY(1,1) NOT NULL,\n" +
            "\t[Name] [nvarchar](250) NULL,\n" +
            "\t[OrderId] [int] NULL,\n" +
            "\t[BitFlag] [int] NULL,\n" +
            "PRIMARY KEY CLUSTERED \n" +
            "(\n" +
            "\t[Id] ASC\n" +
            ")WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]\n" +
            ") ON [PRIMARY]\n" +
            "GO\n" +
            "/****** Object:  Table [dbo].[DDHK_Exhibition]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "SET ANSI_NULLS ON\n" +
            "GO\n" +
            "SET QUOTED_IDENTIFIER ON\n" +
            "GO\n" +
            "CREATE TABLE [dbo].[DDHK_Exhibition](\n" +
            "\t[Id] [bigint] IDENTITY(1,1) NOT NULL,\n" +
            "\t[Name_Cn] [nvarchar](250) NULL,\n" +
            "\t[Name_En] [nvarchar](250) NULL,\n" +
            "\t[Name_Big5] [nvarchar](250) NULL,\n" +
            "\t[StationId] [bigint] NULL,\n" +
            "\t[ExhTypeId] [bigint] NULL,\n" +
            "\t[ExhPropertyName] [nvarchar](250) NULL,\n" +
            "\t[HallName] [nvarchar](250) NULL,\n" +
            "\t[Keywords] [nvarchar](1000) NULL,\n" +
            "\t[Address_Cn] [nvarchar](500) NULL,\n" +
            "\t[Address_Big5] [nvarchar](500) NULL,\n" +
            "\t[Location] [ntext] NULL,\n" +
            "\t[TrafficRoutes] [ntext] NULL,\n" +
            "\t[Telephone] [nvarchar](250) NULL,\n" +
            "\t[BeginDate] [datetime] NULL,\n" +
            "\t[EndDate] [datetime] NULL,\n" +
            "\t[ShowDate] [nvarchar](250) NULL,\n" +
            "\t[Organizer] [nvarchar](250) NULL,\n" +
            "\t[Email] [nvarchar](250) NULL,\n" +
            "\t[WebSite] [nvarchar](250) NULL,\n" +
            "\t[OpenTime] [nvarchar](250) NULL,\n" +
            "\t[LittleTips] [ntext] NULL,\n" +
            "\t[DescText] [ntext] NULL,\n" +
            "\t[TicketInfo] [ntext] NULL,\n" +
            "\t[TicketGuidance] [ntext] NULL,\n" +
            "\t[CoverImageName] [nvarchar](250) NULL,\n" +
            "\t[OfflineMapName] [nvarchar](250) NULL,\n" +
            "\t[Lng] [float] NULL,\n" +
            "\t[Lat] [float] NULL,\n" +
            "\t[Score] [float] NULL,\n" +
            "\t[Likes] [int] NULL,\n" +
            "\t[SortId] [int] NULL,\n" +
            "\t[Replies] [int] NULL,\n" +
            "\t[RenQiValue] [float] NULL,\n" +
            "\t[Favorites] [int] NULL,\n" +
            "\t[IdInExcel] [int] NULL,\n" +
            "\t[Created] [datetime] NULL,\n" +
            "\t[Modified] [datetime] NULL,\n" +
            "\t[StationName] [nvarchar](250) NULL,\n" +
            "PRIMARY KEY CLUSTERED \n" +
            "(\n" +
            "\t[Id] ASC\n" +
            ")WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]\n" +
            ") ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]\n" +
            "GO\n" +
            "/****** Object:  Table [dbo].[DDHK_DaigouProfile]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "SET ANSI_NULLS ON\n" +
            "GO\n" +
            "SET QUOTED_IDENTIFIER ON\n" +
            "GO\n" +
            "CREATE TABLE [dbo].[DDHK_DaigouProfile](\n" +
            "\t[Id] [bigint] IDENTITY(1,1) NOT NULL,\n" +
            "\t[DgUserId] [bigint] NULL,\n" +
            "\t[Province] [nvarchar](20) NULL,\n" +
            "\t[City] [nvarchar](20) NULL,\n" +
            "\t[DgRegion] [nvarchar](250) NULL,\n" +
            "\t[IDType] [int] NULL,\n" +
            "\t[IDNumber] [nvarchar](250) NULL,\n" +
            "\t[VerifyDate] [datetime] NULL,\n" +
            "\t[VerifyType] [nvarchar](250) NULL,\n" +
            "\t[DgCategories] [nvarchar](250) NULL,\n" +
            "\t[Comments] [ntext] NULL,\n" +
            "\t[Score] [float] NULL,\n" +
            "\t[DgOrdersQty] [int] NULL,\n" +
            "\t[DgOrdersAmount] [float] NULL,\n" +
            "\t[Likes] [int] NULL,\n" +
            "\t[SortId] [int] NULL,\n" +
            "\t[Replies] [int] NULL,\n" +
            "\t[Created] [datetime] NULL,\n" +
            "\t[Modified] [datetime] NULL,\n" +
            " CONSTRAINT [PK__DDHK_Dai__3214EC0777FFC2B3] PRIMARY KEY CLUSTERED \n" +
            "(\n" +
            "\t[Id] ASC\n" +
            ")WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]\n" +
            ") ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]\n" +
            "GO\n" +
            "/****** Object:  Table [dbo].[DDHK_DaigouOrder]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "SET ANSI_NULLS ON\n" +
            "GO\n" +
            "SET QUOTED_IDENTIFIER ON\n" +
            "GO\n" +
            "CREATE TABLE [dbo].[DDHK_DaigouOrder](\n" +
            "\t[Id] [bigint] IDENTITY(1,1) NOT NULL,\n" +
            "\t[OrderNo] [nvarchar](20) NULL,\n" +
            "\t[StatusId] [int] NULL,\n" +
            "\t[DgUserId] [bigint] NULL,\n" +
            "\t[BuyUserId] [bigint] NULL,\n" +
            "\t[Likes] [int] NULL,\n" +
            "\t[Products] [nvarchar](1000) NULL,\n" +
            "\t[Address] [nvarchar](500) NULL,\n" +
            "\t[TotalPrice] [float] NULL,\n" +
            "\t[Notes] [nvarchar](500) NULL,\n" +
            "\t[Created] [nvarchar](23) NULL,\n" +
            "\t[Modified] [nvarchar](23) NULL,\n" +
            "\t[PayTime] [nvarchar](23) NULL,\n" +
            "\t[DeliverTime] [nvarchar](23) NULL,\n" +
            "\t[ReceiveTime] [nvarchar](23) NULL,\n" +
            "\t[SellerRefundTime] [nvarchar](23) NULL,\n" +
            "\t[BuyerRefundTime] [nvarchar](23) NULL,\n" +
            "\t[Finished] [nvarchar](23) NULL,\n" +
            "PRIMARY KEY CLUSTERED \n" +
            "(\n" +
            "\t[Id] ASC\n" +
            ")WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]\n" +
            ") ON [PRIMARY]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Daig__Statu__3572E547]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_DaigouOrder] ADD  DEFAULT ((0)) FOR [StatusId]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Daig__DgUse__36670980]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_DaigouOrder] ADD  DEFAULT ((0)) FOR [DgUserId]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Daig__BuyUs__375B2DB9]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_DaigouOrder] ADD  DEFAULT ((0)) FOR [BuyUserId]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Daig__Likes__384F51F2]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_DaigouOrder] ADD  DEFAULT ((0)) FOR [Likes]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Daig__Total__3943762B]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_DaigouOrder] ADD  DEFAULT ((0)) FOR [TotalPrice]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Daig__DgUse__79E80B25]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_DaigouProfile] ADD  CONSTRAINT [DF__DDHK_Daig__DgUse__79E80B25]  DEFAULT ((0)) FOR [DgUserId]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Daig__Score__7ADC2F5E]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_DaigouProfile] ADD  CONSTRAINT [DF__DDHK_Daig__Score__7ADC2F5E]  DEFAULT ((0)) FOR [Score]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Daig__DgOrd__7BD05397]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_DaigouProfile] ADD  CONSTRAINT [DF__DDHK_Daig__DgOrd__7BD05397]  DEFAULT ((0)) FOR [DgOrdersQty]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Daig__DgOrd__7CC477D0]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_DaigouProfile] ADD  CONSTRAINT [DF__DDHK_Daig__DgOrd__7CC477D0]  DEFAULT ((0)) FOR [DgOrdersAmount]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Daig__Likes__7DB89C09]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_DaigouProfile] ADD  CONSTRAINT [DF__DDHK_Daig__Likes__7DB89C09]  DEFAULT ((0)) FOR [Likes]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Daig__SortI__7EACC042]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_DaigouProfile] ADD  CONSTRAINT [DF__DDHK_Daig__SortI__7EACC042]  DEFAULT ((0)) FOR [SortId]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Daig__Repli__7FA0E47B]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_DaigouProfile] ADD  CONSTRAINT [DF__DDHK_Daig__Repli__7FA0E47B]  DEFAULT ((0)) FOR [Replies]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhi__Stati__24485945]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_Exhibition] ADD  DEFAULT ((0)) FOR [StationId]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhi__ExhTy__253C7D7E]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_Exhibition] ADD  DEFAULT ((0)) FOR [ExhTypeId]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhibi__Lng__2630A1B7]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_Exhibition] ADD  DEFAULT ((0)) FOR [Lng]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhibi__Lat__2724C5F0]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_Exhibition] ADD  DEFAULT ((0)) FOR [Lat]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhi__Score__2818EA29]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_Exhibition] ADD  DEFAULT ((0)) FOR [Score]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhi__Likes__290D0E62]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_Exhibition] ADD  DEFAULT ((0)) FOR [Likes]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhi__SortI__2A01329B]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_Exhibition] ADD  DEFAULT ((0)) FOR [SortId]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhi__Repli__2AF556D4]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_Exhibition] ADD  DEFAULT ((0)) FOR [Replies]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhi__RenQi__2BE97B0D]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_Exhibition] ADD  DEFAULT ((0)) FOR [RenQiValue]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhi__Favor__2CDD9F46]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_Exhibition] ADD  DEFAULT ((0)) FOR [Favorites]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhi__IdInE__2DD1C37F]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_Exhibition] ADD  DEFAULT ((0)) FOR [IdInExcel]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhi__Order__226010D3]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_ExhibitionProperty] ADD  DEFAULT ((0)) FOR [OrderId]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhi__BitFl__2354350C]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_ExhibitionProperty] ADD  DEFAULT ((0)) FOR [BitFlag]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhi__Order__2077C861]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_ExhibitionType] ADD  DEFAULT ((0)) FOR [OrderId]\n" +
            "GO\n" +
            "/****** Object:  Default [DF__DDHK_Exhi__BitFl__216BEC9A]    Script Date: 05/24/2016 11:16:32 ******/\n" +
            "ALTER TABLE [dbo].[DDHK_ExhibitionType] ADD  DEFAULT ((0)) FOR [BitFlag]\n" +
            "GO\n";

    public static void main(String[] args) {
        List<ModelAttribute> model = new SqlParse().parse(sql);
        for (ModelAttribute modelAttribute : model){
            System.out.println(modelAttribute);
        }
    }

}
