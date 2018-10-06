CREATE TABLE scm_health_plan_cost_sharing_specification(
 seq BIGINT AUTO_INCREMENT PRIMARY KEY,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AdditionalType
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 additional_type VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$AlternateName
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 alternate_name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Description
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$DisambiguatingDescription
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 disambiguating_description VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$HealthPlanCoinsuranceOption
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 health_plan_coinsurance_option VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$HealthPlanCoinsuranceRate
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Float
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Integer
  *        org.kyojo.schemaorg.m3n4.core.DataType$Number
  */
 health_plan_coinsurance_rate VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$HealthPlanCopay
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$CompoundPriceSpecification
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DeliveryChargeSpecification
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PaymentChargeSpecification
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PriceSpecification
  *        org.kyojo.schemaorg.m3n4.core.Clazz$UnitPriceSpecification
  */
 health_plan_copay VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$HealthPlanCopayOption
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 health_plan_copay_option VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$HealthPlanPharmacyCategory
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 health_plan_pharmacy_category VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Identifier
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$LocationFeatureSpecification
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PropertyValue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 identifier VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Image
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$Barcode
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ImageObject
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 image VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$MainEntityOfPage
  * param: org.kyojo.schemaorg.m3n4.bib.Clazz$Atlas
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$Audiobook
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$Chapter
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$Collection
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$ComicCoverArt
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$ComicIssue
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$ComicSeries
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$ComicStory
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$CoverArt
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$Newspaper
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$Thesis
  *        org.kyojo.schemaorg.m3n4.core.Clazz$APIReference
  *        org.kyojo.schemaorg.m3n4.core.Clazz$AboutPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Answer
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Article
  *        org.kyojo.schemaorg.m3n4.core.Clazz$AudioObject
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Barcode
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Blog
  *        org.kyojo.schemaorg.m3n4.core.Clazz$BlogPosting
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Book
  *        org.kyojo.schemaorg.m3n4.core.Clazz$BookSeries
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CheckoutPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ClaimReview
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Clip
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CollectionPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Comment
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ContactPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Conversation
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Course
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWorkSeason
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWorkSeries
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DataCatalog
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DataDownload
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DataFeed
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Dataset
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DigitalDocument
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DiscussionForumPosting
  *        org.kyojo.schemaorg.m3n4.core.Clazz$EmailMessage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Episode
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Game
  *        org.kyojo.schemaorg.m3n4.core.Clazz$HowTo
  *        org.kyojo.schemaorg.m3n4.core.Clazz$HowToDirection
  *        org.kyojo.schemaorg.m3n4.core.Clazz$HowToSection
  *        org.kyojo.schemaorg.m3n4.core.Clazz$HowToStep
  *        org.kyojo.schemaorg.m3n4.core.Clazz$HowToTip
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ImageGallery
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ImageObject
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ItemPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$LiveBlogPosting
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Map
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MediaObject
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Menu
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MenuSection
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Message
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MobileApplication
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Movie
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MovieClip
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MovieSeries
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MusicAlbum
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MusicComposition
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MusicPlaylist
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MusicRecording
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MusicRelease
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MusicVideoObject
  *        org.kyojo.schemaorg.m3n4.core.Clazz$NewsArticle
  *        org.kyojo.schemaorg.m3n4.core.Clazz$NoteDigitalDocument
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Painting
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Periodical
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Photograph
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PresentationDigitalDocument
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ProfilePage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PublicationIssue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PublicationVolume
  *        org.kyojo.schemaorg.m3n4.core.Clazz$QAPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Question
  *        org.kyojo.schemaorg.m3n4.core.Clazz$RadioClip
  *        org.kyojo.schemaorg.m3n4.core.Clazz$RadioEpisode
  *        org.kyojo.schemaorg.m3n4.core.Clazz$RadioSeason
  *        org.kyojo.schemaorg.m3n4.core.Clazz$RadioSeries
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Recipe
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Report
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Review
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ScholarlyArticle
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Sculpture
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SearchResultsPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SiteNavigationElement
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SocialMediaPosting
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SoftwareApplication
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SoftwareSourceCode
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SpreadsheetDigitalDocument
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TVClip
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TVEpisode
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TVSeason
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TVSeries
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Table
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TechArticle
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TextDigitalDocument
  *        org.kyojo.schemaorg.m3n4.core.Clazz$URL
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VideoGallery
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VideoGame
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VideoGameClip
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VideoGameSeries
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VideoObject
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VisualArtwork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WPAdBlock
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WPFooter
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WPHeader
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WPSideBar
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WebApplication
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WebPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WebPageElement
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WebSite
  *        org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$Diet
  *        org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$ExercisePlan
  *        org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicalScholarlyArticle
  *        org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicalWebPage
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$AdvertiserContentArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$AnalysisNewsArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$AskPublicNewsArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$BackgroundNewsArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$CategoryCodeSet
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$Claim
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$CompleteDataFeed
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$CorrectionComment
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$CriticReview
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$DefinedTermSet
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$EmployerReview
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$FAQPage
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$Legislation
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$LegislationObject
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$OpinionNewsArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$Quotation
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$ReportageNewsArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$ReviewNewsArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$SatiricalArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$UserReview
  */
 main_entity_of_page VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Name
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 name VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$NameFuzzy
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 name_fuzzy VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$NameRuby
  * param: org.kyojo.schemaorg.m3n4.core.DataType$Text
  */
 name_ruby VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$PotentialAction
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$AcceptAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$AchieveAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Action
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ActivateAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$AddAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$AgreeAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$AllocateAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$AppendAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ApplyAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ArriveAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$AskAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$AssessAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$AssignAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$AuthorizeAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$BefriendAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$BookmarkAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$BorrowAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$BuyAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CancelAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CheckAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CheckInAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CheckOutAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ChooseAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CommentAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CommunicateAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ConfirmAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ConsumeAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ControlAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CookAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CreateAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DeactivateAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DeleteAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DepartAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DisagreeAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DiscoverAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DislikeAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DonateAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DownloadAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DrawAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DrinkAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$EatAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$EndorseAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ExerciseAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$FilmAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$FindAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$FollowAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$GiveAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$IgnoreAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$InformAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$InsertAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$InstallAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$InteractAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$InviteAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$JoinAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$LeaveAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$LendAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$LikeAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ListenAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$LoseAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MarryAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MoveAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$OrderAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$OrganizeAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PaintAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PayAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PerformAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PhotographAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PlanAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PlayAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PrependAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$QuoteAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ReactAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ReadAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ReceiveAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$RegisterAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$RejectAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$RentAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ReplaceAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ReplyAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ReserveAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ResumeAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ReturnAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ReviewAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$RsvpAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ScheduleAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SearchAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SellAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SendAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ShareAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SubscribeAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SuspendAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TakeAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TieAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TipAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TrackAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TradeAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TransferAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TravelAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$UnRegisterAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$UpdateAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$UseAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ViewAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VoteAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WantAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WatchAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WearAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WinAction
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WriteAction
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$MoneyTransfer
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$PreOrderAction
  */
 potential_action VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$SameAs
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 same_as VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.pending.Container$SubjectOf
  * param: org.kyojo.schemaorg.m3n4.bib.Clazz$Atlas
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$Audiobook
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$Chapter
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$Collection
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$ComicCoverArt
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$ComicIssue
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$ComicSeries
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$ComicStory
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$CoverArt
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$Newspaper
  *        org.kyojo.schemaorg.m3n4.bib.Clazz$Thesis
  *        org.kyojo.schemaorg.m3n4.core.Clazz$APIReference
  *        org.kyojo.schemaorg.m3n4.core.Clazz$AboutPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Answer
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Article
  *        org.kyojo.schemaorg.m3n4.core.Clazz$AudioObject
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Barcode
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Blog
  *        org.kyojo.schemaorg.m3n4.core.Clazz$BlogPosting
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Book
  *        org.kyojo.schemaorg.m3n4.core.Clazz$BookSeries
  *        org.kyojo.schemaorg.m3n4.core.Clazz$BroadcastEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$BusinessEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CheckoutPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ChildrensEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ClaimReview
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Clip
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CollectionPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ComedyEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Comment
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ContactPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Conversation
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Course
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CourseInstance
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWorkSeason
  *        org.kyojo.schemaorg.m3n4.core.Clazz$CreativeWorkSeries
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DanceEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DataCatalog
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DataDownload
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DataFeed
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Dataset
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DeliveryEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DigitalDocument
  *        org.kyojo.schemaorg.m3n4.core.Clazz$DiscussionForumPosting
  *        org.kyojo.schemaorg.m3n4.core.Clazz$EducationEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$EmailMessage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Episode
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Event
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ExhibitionEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Festival
  *        org.kyojo.schemaorg.m3n4.core.Clazz$FoodEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Game
  *        org.kyojo.schemaorg.m3n4.core.Clazz$HowTo
  *        org.kyojo.schemaorg.m3n4.core.Clazz$HowToDirection
  *        org.kyojo.schemaorg.m3n4.core.Clazz$HowToSection
  *        org.kyojo.schemaorg.m3n4.core.Clazz$HowToStep
  *        org.kyojo.schemaorg.m3n4.core.Clazz$HowToTip
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ImageGallery
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ImageObject
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ItemPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$LiteraryEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$LiveBlogPosting
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Map
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MediaObject
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Menu
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MenuSection
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Message
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MobileApplication
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Movie
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MovieClip
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MovieSeries
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MusicAlbum
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MusicComposition
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MusicEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MusicPlaylist
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MusicRecording
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MusicRelease
  *        org.kyojo.schemaorg.m3n4.core.Clazz$MusicVideoObject
  *        org.kyojo.schemaorg.m3n4.core.Clazz$NewsArticle
  *        org.kyojo.schemaorg.m3n4.core.Clazz$NoteDigitalDocument
  *        org.kyojo.schemaorg.m3n4.core.Clazz$OnDemandEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Painting
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Periodical
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Photograph
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PresentationDigitalDocument
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ProfilePage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PublicationEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PublicationIssue
  *        org.kyojo.schemaorg.m3n4.core.Clazz$PublicationVolume
  *        org.kyojo.schemaorg.m3n4.core.Clazz$QAPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Question
  *        org.kyojo.schemaorg.m3n4.core.Clazz$RadioClip
  *        org.kyojo.schemaorg.m3n4.core.Clazz$RadioEpisode
  *        org.kyojo.schemaorg.m3n4.core.Clazz$RadioSeason
  *        org.kyojo.schemaorg.m3n4.core.Clazz$RadioSeries
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Recipe
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Report
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Review
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SaleEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ScholarlyArticle
  *        org.kyojo.schemaorg.m3n4.core.Clazz$ScreeningEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Sculpture
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SearchResultsPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SiteNavigationElement
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SocialEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SocialMediaPosting
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SoftwareApplication
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SoftwareSourceCode
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SportsEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$SpreadsheetDigitalDocument
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TVClip
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TVEpisode
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TVSeason
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TVSeries
  *        org.kyojo.schemaorg.m3n4.core.Clazz$Table
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TechArticle
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TextDigitalDocument
  *        org.kyojo.schemaorg.m3n4.core.Clazz$TheaterEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VideoGallery
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VideoGame
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VideoGameClip
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VideoGameSeries
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VideoObject
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VisualArtsEvent
  *        org.kyojo.schemaorg.m3n4.core.Clazz$VisualArtwork
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WPAdBlock
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WPFooter
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WPHeader
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WPSideBar
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WebApplication
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WebPage
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WebPageElement
  *        org.kyojo.schemaorg.m3n4.core.Clazz$WebSite
  *        org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$Diet
  *        org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$ExercisePlan
  *        org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicalScholarlyArticle
  *        org.kyojo.schemaorg.m3n4.healthLifesci.Clazz$MedicalWebPage
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$AdvertiserContentArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$AnalysisNewsArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$AskPublicNewsArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$BackgroundNewsArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$CategoryCodeSet
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$Claim
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$CompleteDataFeed
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$CorrectionComment
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$CriticReview
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$DefinedTermSet
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$EmployerReview
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$EventSeries
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$FAQPage
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$Legislation
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$LegislationObject
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$OpinionNewsArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$Quotation
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$ReportageNewsArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$ReviewNewsArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$SatiricalArticle
  *        org.kyojo.schemaorg.m3n4.pending.Clazz$UserReview
  */
 subject_of VARCHAR(100) NULL,

 /**
  * type:  org.kyojo.schemaorg.m3n4.core.Container$Url
  * param: org.kyojo.schemaorg.m3n4.core.Clazz$URL
  */
 url VARCHAR(100) NULL,

 ref_seq BIGINT NULL,
 ref_acr VARCHAR(100) NULL,
 created_at TIMESTAMP NULL,
 created_by BIGINT NULL,
 updated_at TIMESTAMP NULL,
 updated_by BIGINT NULL
 expired_at TIMESTAMP NULL,
 expired_by BIGINT NULL

);