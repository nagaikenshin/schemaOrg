package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.AcceptAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AchieveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.Action;
import org.kyojo.schemaorg.m3n4.core.Clazz.ActivateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AddAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AgreeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AllocateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AppendAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ApplyAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ArriveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AskAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AssessAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AssignAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.AuthorizeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.BefriendAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.BookmarkAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.BorrowAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.BuyAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CancelAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CheckAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CheckInAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CheckOutAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ChooseAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CommentAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CommunicateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ConfirmAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ConsumeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ControlAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CookAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.CreateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeactivateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeleteAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DepartAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DisagreeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DiscoverAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DislikeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DonateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DownloadAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DrawAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.DrinkAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.EatAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.EndorseAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ExerciseAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.FilmAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.FindAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.FollowAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.GiveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.IgnoreAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.InformAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.InsertAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.InstallAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.InteractAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.InviteAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.JoinAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.LeaveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.LendAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.LikeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ListenAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.LoseAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.MarryAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.MoveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.OrderAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.OrganizeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.PaintAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.PayAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.PerformAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.PhotographAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.PlanAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.PlayAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.PrependAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.QuoteAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReactAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReadAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReceiveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.RegisterAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.RejectAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.RentAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReplaceAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReplyAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReserveAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ResumeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReturnAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ReviewAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.RsvpAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ScheduleAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.SearchAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.SellAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.SendAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ShareAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.SubscribeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.SuspendAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TakeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TieAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TipAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TrackAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TradeAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TransferAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.TravelAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.UnRegisterAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.UpdateAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.UseAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.ViewAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.VoteAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.WantAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.WatchAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.WearAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.WinAction;
import org.kyojo.schemaorg.m3n4.core.Clazz.WriteAction;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.pending.Clazz.MoneyTransfer;
import org.kyojo.schemaorg.m3n4.pending.Clazz.PreOrderAction;

public class POTENTIAL_ACTION implements Container.PotentialAction {

	private static final long serialVersionUID = 1L;

	public List<AcceptAction> acceptActionList;
	public List<AchieveAction> achieveActionList;
	public List<Action> actionList;
	public List<ActivateAction> activateActionList;
	public List<AddAction> addActionList;
	public List<AgreeAction> agreeActionList;
	public List<AllocateAction> allocateActionList;
	public List<AppendAction> appendActionList;
	public List<ApplyAction> applyActionList;
	public List<ArriveAction> arriveActionList;
	public List<AskAction> askActionList;
	public List<AssessAction> assessActionList;
	public List<AssignAction> assignActionList;
	public List<AuthorizeAction> authorizeActionList;
	public List<BefriendAction> befriendActionList;
	public List<BookmarkAction> bookmarkActionList;
	public List<BorrowAction> borrowActionList;
	public List<BuyAction> buyActionList;
	public List<CancelAction> cancelActionList;
	public List<CheckAction> checkActionList;
	public List<CheckInAction> checkInActionList;
	public List<CheckOutAction> checkOutActionList;
	public List<ChooseAction> chooseActionList;
	public List<CommentAction> commentActionList;
	public List<CommunicateAction> communicateActionList;
	public List<ConfirmAction> confirmActionList;
	public List<ConsumeAction> consumeActionList;
	public List<ControlAction> controlActionList;
	public List<CookAction> cookActionList;
	public List<CreateAction> createActionList;
	public List<DeactivateAction> deactivateActionList;
	public List<DeleteAction> deleteActionList;
	public List<DepartAction> departActionList;
	public List<DisagreeAction> disagreeActionList;
	public List<DiscoverAction> discoverActionList;
	public List<DislikeAction> dislikeActionList;
	public List<DonateAction> donateActionList;
	public List<DownloadAction> downloadActionList;
	public List<DrawAction> drawActionList;
	public List<DrinkAction> drinkActionList;
	public List<EatAction> eatActionList;
	public List<EndorseAction> endorseActionList;
	public List<ExerciseAction> exerciseActionList;
	public List<FilmAction> filmActionList;
	public List<FindAction> findActionList;
	public List<FollowAction> followActionList;
	public List<GiveAction> giveActionList;
	public List<IgnoreAction> ignoreActionList;
	public List<InformAction> informActionList;
	public List<InsertAction> insertActionList;
	public List<InstallAction> installActionList;
	public List<InteractAction> interactActionList;
	public List<InviteAction> inviteActionList;
	public List<JoinAction> joinActionList;
	public List<LeaveAction> leaveActionList;
	public List<LendAction> lendActionList;
	public List<LikeAction> likeActionList;
	public List<ListenAction> listenActionList;
	public List<LoseAction> loseActionList;
	public List<MarryAction> marryActionList;
	public List<MoneyTransfer> moneyTransferList;
	public List<MoveAction> moveActionList;
	public List<OrderAction> orderActionList;
	public List<OrganizeAction> organizeActionList;
	public List<PaintAction> paintActionList;
	public List<PayAction> payActionList;
	public List<PerformAction> performActionList;
	public List<PhotographAction> photographActionList;
	public List<PlanAction> planActionList;
	public List<PlayAction> playActionList;
	public List<PreOrderAction> preOrderActionList;
	public List<PrependAction> prependActionList;
	public List<QuoteAction> quoteActionList;
	public List<ReactAction> reactActionList;
	public List<ReadAction> readActionList;
	public List<ReceiveAction> receiveActionList;
	public List<RegisterAction> registerActionList;
	public List<RejectAction> rejectActionList;
	public List<RentAction> rentActionList;
	public List<ReplaceAction> replaceActionList;
	public List<ReplyAction> replyActionList;
	public List<ReserveAction> reserveActionList;
	public List<ResumeAction> resumeActionList;
	public List<ReturnAction> returnActionList;
	public List<ReviewAction> reviewActionList;
	public List<RsvpAction> rsvpActionList;
	public List<ScheduleAction> scheduleActionList;
	public List<SearchAction> searchActionList;
	public List<SellAction> sellActionList;
	public List<SendAction> sendActionList;
	public List<ShareAction> shareActionList;
	public List<SubscribeAction> subscribeActionList;
	public List<SuspendAction> suspendActionList;
	public List<TakeAction> takeActionList;
	public List<TieAction> tieActionList;
	public List<TipAction> tipActionList;
	public List<TrackAction> trackActionList;
	public List<TradeAction> tradeActionList;
	public List<TransferAction> transferActionList;
	public List<TravelAction> travelActionList;
	public List<UnRegisterAction> unRegisterActionList;
	public List<UpdateAction> updateActionList;
	public List<UseAction> useActionList;
	public List<ViewAction> viewActionList;
	public List<VoteAction> voteActionList;
	public List<WantAction> wantActionList;
	public List<WatchAction> watchActionList;
	public List<WearAction> wearActionList;
	public List<WinAction> winActionList;
	public List<WriteAction> writeActionList;

	public POTENTIAL_ACTION() {
	}

	public POTENTIAL_ACTION(String string) {
		this(new ACTION(string));
	}

	public String getString() {
		if(actionList == null || actionList.size() == 0 || actionList.get(0) == null) {
			return null;
		} else {
			Name name = actionList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(actionList == null) {
			actionList = new ArrayList<Action>();
		}
		if(actionList.size() == 0) {
			actionList.add(new ACTION(string));
		} else {
			actionList.set(0, new ACTION(string));
		}
	}

	public POTENTIAL_ACTION(AcceptAction acceptAction) {
		acceptActionList = new ArrayList<AcceptAction>();
		acceptActionList.add(acceptAction);
	}

	@Override
	public AcceptAction getAcceptAction() {
		if(acceptActionList != null && acceptActionList.size() > 0) {
			return acceptActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAcceptAction(AcceptAction acceptAction) {
		if(acceptActionList == null) {
			acceptActionList = new ArrayList<>();
		}
		if(acceptActionList.size() == 0) {
			acceptActionList.add(acceptAction);
		} else {
			acceptActionList.set(0, acceptAction);
		}
	}

	@Override
	public List<AcceptAction> getAcceptActionList() {
		return acceptActionList;
	}

	@Override
	public void setAcceptActionList(List<AcceptAction> acceptActionList) {
		this.acceptActionList = acceptActionList;
	}

	@Override
	public boolean hasAcceptAction() {
		return acceptActionList != null && acceptActionList.size() > 0 && acceptActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(AchieveAction achieveAction) {
		achieveActionList = new ArrayList<AchieveAction>();
		achieveActionList.add(achieveAction);
	}

	@Override
	public AchieveAction getAchieveAction() {
		if(achieveActionList != null && achieveActionList.size() > 0) {
			return achieveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAchieveAction(AchieveAction achieveAction) {
		if(achieveActionList == null) {
			achieveActionList = new ArrayList<>();
		}
		if(achieveActionList.size() == 0) {
			achieveActionList.add(achieveAction);
		} else {
			achieveActionList.set(0, achieveAction);
		}
	}

	@Override
	public List<AchieveAction> getAchieveActionList() {
		return achieveActionList;
	}

	@Override
	public void setAchieveActionList(List<AchieveAction> achieveActionList) {
		this.achieveActionList = achieveActionList;
	}

	@Override
	public boolean hasAchieveAction() {
		return achieveActionList != null && achieveActionList.size() > 0 && achieveActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(Action action) {
		actionList = new ArrayList<Action>();
		actionList.add(action);
	}

	@Override
	public Action getAction() {
		if(actionList != null && actionList.size() > 0) {
			return actionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAction(Action action) {
		if(actionList == null) {
			actionList = new ArrayList<>();
		}
		if(actionList.size() == 0) {
			actionList.add(action);
		} else {
			actionList.set(0, action);
		}
	}

	@Override
	public List<Action> getActionList() {
		return actionList;
	}

	@Override
	public void setActionList(List<Action> actionList) {
		this.actionList = actionList;
	}

	@Override
	public boolean hasAction() {
		return actionList != null && actionList.size() > 0 && actionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ActivateAction activateAction) {
		activateActionList = new ArrayList<ActivateAction>();
		activateActionList.add(activateAction);
	}

	@Override
	public ActivateAction getActivateAction() {
		if(activateActionList != null && activateActionList.size() > 0) {
			return activateActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setActivateAction(ActivateAction activateAction) {
		if(activateActionList == null) {
			activateActionList = new ArrayList<>();
		}
		if(activateActionList.size() == 0) {
			activateActionList.add(activateAction);
		} else {
			activateActionList.set(0, activateAction);
		}
	}

	@Override
	public List<ActivateAction> getActivateActionList() {
		return activateActionList;
	}

	@Override
	public void setActivateActionList(List<ActivateAction> activateActionList) {
		this.activateActionList = activateActionList;
	}

	@Override
	public boolean hasActivateAction() {
		return activateActionList != null && activateActionList.size() > 0 && activateActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(AddAction addAction) {
		addActionList = new ArrayList<AddAction>();
		addActionList.add(addAction);
	}

	@Override
	public AddAction getAddAction() {
		if(addActionList != null && addActionList.size() > 0) {
			return addActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAddAction(AddAction addAction) {
		if(addActionList == null) {
			addActionList = new ArrayList<>();
		}
		if(addActionList.size() == 0) {
			addActionList.add(addAction);
		} else {
			addActionList.set(0, addAction);
		}
	}

	@Override
	public List<AddAction> getAddActionList() {
		return addActionList;
	}

	@Override
	public void setAddActionList(List<AddAction> addActionList) {
		this.addActionList = addActionList;
	}

	@Override
	public boolean hasAddAction() {
		return addActionList != null && addActionList.size() > 0 && addActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(AgreeAction agreeAction) {
		agreeActionList = new ArrayList<AgreeAction>();
		agreeActionList.add(agreeAction);
	}

	@Override
	public AgreeAction getAgreeAction() {
		if(agreeActionList != null && agreeActionList.size() > 0) {
			return agreeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAgreeAction(AgreeAction agreeAction) {
		if(agreeActionList == null) {
			agreeActionList = new ArrayList<>();
		}
		if(agreeActionList.size() == 0) {
			agreeActionList.add(agreeAction);
		} else {
			agreeActionList.set(0, agreeAction);
		}
	}

	@Override
	public List<AgreeAction> getAgreeActionList() {
		return agreeActionList;
	}

	@Override
	public void setAgreeActionList(List<AgreeAction> agreeActionList) {
		this.agreeActionList = agreeActionList;
	}

	@Override
	public boolean hasAgreeAction() {
		return agreeActionList != null && agreeActionList.size() > 0 && agreeActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(AllocateAction allocateAction) {
		allocateActionList = new ArrayList<AllocateAction>();
		allocateActionList.add(allocateAction);
	}

	@Override
	public AllocateAction getAllocateAction() {
		if(allocateActionList != null && allocateActionList.size() > 0) {
			return allocateActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAllocateAction(AllocateAction allocateAction) {
		if(allocateActionList == null) {
			allocateActionList = new ArrayList<>();
		}
		if(allocateActionList.size() == 0) {
			allocateActionList.add(allocateAction);
		} else {
			allocateActionList.set(0, allocateAction);
		}
	}

	@Override
	public List<AllocateAction> getAllocateActionList() {
		return allocateActionList;
	}

	@Override
	public void setAllocateActionList(List<AllocateAction> allocateActionList) {
		this.allocateActionList = allocateActionList;
	}

	@Override
	public boolean hasAllocateAction() {
		return allocateActionList != null && allocateActionList.size() > 0 && allocateActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(AppendAction appendAction) {
		appendActionList = new ArrayList<AppendAction>();
		appendActionList.add(appendAction);
	}

	@Override
	public AppendAction getAppendAction() {
		if(appendActionList != null && appendActionList.size() > 0) {
			return appendActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAppendAction(AppendAction appendAction) {
		if(appendActionList == null) {
			appendActionList = new ArrayList<>();
		}
		if(appendActionList.size() == 0) {
			appendActionList.add(appendAction);
		} else {
			appendActionList.set(0, appendAction);
		}
	}

	@Override
	public List<AppendAction> getAppendActionList() {
		return appendActionList;
	}

	@Override
	public void setAppendActionList(List<AppendAction> appendActionList) {
		this.appendActionList = appendActionList;
	}

	@Override
	public boolean hasAppendAction() {
		return appendActionList != null && appendActionList.size() > 0 && appendActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ApplyAction applyAction) {
		applyActionList = new ArrayList<ApplyAction>();
		applyActionList.add(applyAction);
	}

	@Override
	public ApplyAction getApplyAction() {
		if(applyActionList != null && applyActionList.size() > 0) {
			return applyActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setApplyAction(ApplyAction applyAction) {
		if(applyActionList == null) {
			applyActionList = new ArrayList<>();
		}
		if(applyActionList.size() == 0) {
			applyActionList.add(applyAction);
		} else {
			applyActionList.set(0, applyAction);
		}
	}

	@Override
	public List<ApplyAction> getApplyActionList() {
		return applyActionList;
	}

	@Override
	public void setApplyActionList(List<ApplyAction> applyActionList) {
		this.applyActionList = applyActionList;
	}

	@Override
	public boolean hasApplyAction() {
		return applyActionList != null && applyActionList.size() > 0 && applyActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ArriveAction arriveAction) {
		arriveActionList = new ArrayList<ArriveAction>();
		arriveActionList.add(arriveAction);
	}

	@Override
	public ArriveAction getArriveAction() {
		if(arriveActionList != null && arriveActionList.size() > 0) {
			return arriveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setArriveAction(ArriveAction arriveAction) {
		if(arriveActionList == null) {
			arriveActionList = new ArrayList<>();
		}
		if(arriveActionList.size() == 0) {
			arriveActionList.add(arriveAction);
		} else {
			arriveActionList.set(0, arriveAction);
		}
	}

	@Override
	public List<ArriveAction> getArriveActionList() {
		return arriveActionList;
	}

	@Override
	public void setArriveActionList(List<ArriveAction> arriveActionList) {
		this.arriveActionList = arriveActionList;
	}

	@Override
	public boolean hasArriveAction() {
		return arriveActionList != null && arriveActionList.size() > 0 && arriveActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(AskAction askAction) {
		askActionList = new ArrayList<AskAction>();
		askActionList.add(askAction);
	}

	@Override
	public AskAction getAskAction() {
		if(askActionList != null && askActionList.size() > 0) {
			return askActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAskAction(AskAction askAction) {
		if(askActionList == null) {
			askActionList = new ArrayList<>();
		}
		if(askActionList.size() == 0) {
			askActionList.add(askAction);
		} else {
			askActionList.set(0, askAction);
		}
	}

	@Override
	public List<AskAction> getAskActionList() {
		return askActionList;
	}

	@Override
	public void setAskActionList(List<AskAction> askActionList) {
		this.askActionList = askActionList;
	}

	@Override
	public boolean hasAskAction() {
		return askActionList != null && askActionList.size() > 0 && askActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(AssessAction assessAction) {
		assessActionList = new ArrayList<AssessAction>();
		assessActionList.add(assessAction);
	}

	@Override
	public AssessAction getAssessAction() {
		if(assessActionList != null && assessActionList.size() > 0) {
			return assessActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAssessAction(AssessAction assessAction) {
		if(assessActionList == null) {
			assessActionList = new ArrayList<>();
		}
		if(assessActionList.size() == 0) {
			assessActionList.add(assessAction);
		} else {
			assessActionList.set(0, assessAction);
		}
	}

	@Override
	public List<AssessAction> getAssessActionList() {
		return assessActionList;
	}

	@Override
	public void setAssessActionList(List<AssessAction> assessActionList) {
		this.assessActionList = assessActionList;
	}

	@Override
	public boolean hasAssessAction() {
		return assessActionList != null && assessActionList.size() > 0 && assessActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(AssignAction assignAction) {
		assignActionList = new ArrayList<AssignAction>();
		assignActionList.add(assignAction);
	}

	@Override
	public AssignAction getAssignAction() {
		if(assignActionList != null && assignActionList.size() > 0) {
			return assignActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAssignAction(AssignAction assignAction) {
		if(assignActionList == null) {
			assignActionList = new ArrayList<>();
		}
		if(assignActionList.size() == 0) {
			assignActionList.add(assignAction);
		} else {
			assignActionList.set(0, assignAction);
		}
	}

	@Override
	public List<AssignAction> getAssignActionList() {
		return assignActionList;
	}

	@Override
	public void setAssignActionList(List<AssignAction> assignActionList) {
		this.assignActionList = assignActionList;
	}

	@Override
	public boolean hasAssignAction() {
		return assignActionList != null && assignActionList.size() > 0 && assignActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(AuthorizeAction authorizeAction) {
		authorizeActionList = new ArrayList<AuthorizeAction>();
		authorizeActionList.add(authorizeAction);
	}

	@Override
	public AuthorizeAction getAuthorizeAction() {
		if(authorizeActionList != null && authorizeActionList.size() > 0) {
			return authorizeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAuthorizeAction(AuthorizeAction authorizeAction) {
		if(authorizeActionList == null) {
			authorizeActionList = new ArrayList<>();
		}
		if(authorizeActionList.size() == 0) {
			authorizeActionList.add(authorizeAction);
		} else {
			authorizeActionList.set(0, authorizeAction);
		}
	}

	@Override
	public List<AuthorizeAction> getAuthorizeActionList() {
		return authorizeActionList;
	}

	@Override
	public void setAuthorizeActionList(List<AuthorizeAction> authorizeActionList) {
		this.authorizeActionList = authorizeActionList;
	}

	@Override
	public boolean hasAuthorizeAction() {
		return authorizeActionList != null && authorizeActionList.size() > 0 && authorizeActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(BefriendAction befriendAction) {
		befriendActionList = new ArrayList<BefriendAction>();
		befriendActionList.add(befriendAction);
	}

	@Override
	public BefriendAction getBefriendAction() {
		if(befriendActionList != null && befriendActionList.size() > 0) {
			return befriendActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBefriendAction(BefriendAction befriendAction) {
		if(befriendActionList == null) {
			befriendActionList = new ArrayList<>();
		}
		if(befriendActionList.size() == 0) {
			befriendActionList.add(befriendAction);
		} else {
			befriendActionList.set(0, befriendAction);
		}
	}

	@Override
	public List<BefriendAction> getBefriendActionList() {
		return befriendActionList;
	}

	@Override
	public void setBefriendActionList(List<BefriendAction> befriendActionList) {
		this.befriendActionList = befriendActionList;
	}

	@Override
	public boolean hasBefriendAction() {
		return befriendActionList != null && befriendActionList.size() > 0 && befriendActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(BookmarkAction bookmarkAction) {
		bookmarkActionList = new ArrayList<BookmarkAction>();
		bookmarkActionList.add(bookmarkAction);
	}

	@Override
	public BookmarkAction getBookmarkAction() {
		if(bookmarkActionList != null && bookmarkActionList.size() > 0) {
			return bookmarkActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBookmarkAction(BookmarkAction bookmarkAction) {
		if(bookmarkActionList == null) {
			bookmarkActionList = new ArrayList<>();
		}
		if(bookmarkActionList.size() == 0) {
			bookmarkActionList.add(bookmarkAction);
		} else {
			bookmarkActionList.set(0, bookmarkAction);
		}
	}

	@Override
	public List<BookmarkAction> getBookmarkActionList() {
		return bookmarkActionList;
	}

	@Override
	public void setBookmarkActionList(List<BookmarkAction> bookmarkActionList) {
		this.bookmarkActionList = bookmarkActionList;
	}

	@Override
	public boolean hasBookmarkAction() {
		return bookmarkActionList != null && bookmarkActionList.size() > 0 && bookmarkActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(BorrowAction borrowAction) {
		borrowActionList = new ArrayList<BorrowAction>();
		borrowActionList.add(borrowAction);
	}

	@Override
	public BorrowAction getBorrowAction() {
		if(borrowActionList != null && borrowActionList.size() > 0) {
			return borrowActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBorrowAction(BorrowAction borrowAction) {
		if(borrowActionList == null) {
			borrowActionList = new ArrayList<>();
		}
		if(borrowActionList.size() == 0) {
			borrowActionList.add(borrowAction);
		} else {
			borrowActionList.set(0, borrowAction);
		}
	}

	@Override
	public List<BorrowAction> getBorrowActionList() {
		return borrowActionList;
	}

	@Override
	public void setBorrowActionList(List<BorrowAction> borrowActionList) {
		this.borrowActionList = borrowActionList;
	}

	@Override
	public boolean hasBorrowAction() {
		return borrowActionList != null && borrowActionList.size() > 0 && borrowActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(BuyAction buyAction) {
		buyActionList = new ArrayList<BuyAction>();
		buyActionList.add(buyAction);
	}

	@Override
	public BuyAction getBuyAction() {
		if(buyActionList != null && buyActionList.size() > 0) {
			return buyActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBuyAction(BuyAction buyAction) {
		if(buyActionList == null) {
			buyActionList = new ArrayList<>();
		}
		if(buyActionList.size() == 0) {
			buyActionList.add(buyAction);
		} else {
			buyActionList.set(0, buyAction);
		}
	}

	@Override
	public List<BuyAction> getBuyActionList() {
		return buyActionList;
	}

	@Override
	public void setBuyActionList(List<BuyAction> buyActionList) {
		this.buyActionList = buyActionList;
	}

	@Override
	public boolean hasBuyAction() {
		return buyActionList != null && buyActionList.size() > 0 && buyActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(CancelAction cancelAction) {
		cancelActionList = new ArrayList<CancelAction>();
		cancelActionList.add(cancelAction);
	}

	@Override
	public CancelAction getCancelAction() {
		if(cancelActionList != null && cancelActionList.size() > 0) {
			return cancelActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCancelAction(CancelAction cancelAction) {
		if(cancelActionList == null) {
			cancelActionList = new ArrayList<>();
		}
		if(cancelActionList.size() == 0) {
			cancelActionList.add(cancelAction);
		} else {
			cancelActionList.set(0, cancelAction);
		}
	}

	@Override
	public List<CancelAction> getCancelActionList() {
		return cancelActionList;
	}

	@Override
	public void setCancelActionList(List<CancelAction> cancelActionList) {
		this.cancelActionList = cancelActionList;
	}

	@Override
	public boolean hasCancelAction() {
		return cancelActionList != null && cancelActionList.size() > 0 && cancelActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(CheckAction checkAction) {
		checkActionList = new ArrayList<CheckAction>();
		checkActionList.add(checkAction);
	}

	@Override
	public CheckAction getCheckAction() {
		if(checkActionList != null && checkActionList.size() > 0) {
			return checkActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCheckAction(CheckAction checkAction) {
		if(checkActionList == null) {
			checkActionList = new ArrayList<>();
		}
		if(checkActionList.size() == 0) {
			checkActionList.add(checkAction);
		} else {
			checkActionList.set(0, checkAction);
		}
	}

	@Override
	public List<CheckAction> getCheckActionList() {
		return checkActionList;
	}

	@Override
	public void setCheckActionList(List<CheckAction> checkActionList) {
		this.checkActionList = checkActionList;
	}

	@Override
	public boolean hasCheckAction() {
		return checkActionList != null && checkActionList.size() > 0 && checkActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(CheckInAction checkInAction) {
		checkInActionList = new ArrayList<CheckInAction>();
		checkInActionList.add(checkInAction);
	}

	@Override
	public CheckInAction getCheckInAction() {
		if(checkInActionList != null && checkInActionList.size() > 0) {
			return checkInActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCheckInAction(CheckInAction checkInAction) {
		if(checkInActionList == null) {
			checkInActionList = new ArrayList<>();
		}
		if(checkInActionList.size() == 0) {
			checkInActionList.add(checkInAction);
		} else {
			checkInActionList.set(0, checkInAction);
		}
	}

	@Override
	public List<CheckInAction> getCheckInActionList() {
		return checkInActionList;
	}

	@Override
	public void setCheckInActionList(List<CheckInAction> checkInActionList) {
		this.checkInActionList = checkInActionList;
	}

	@Override
	public boolean hasCheckInAction() {
		return checkInActionList != null && checkInActionList.size() > 0 && checkInActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(CheckOutAction checkOutAction) {
		checkOutActionList = new ArrayList<CheckOutAction>();
		checkOutActionList.add(checkOutAction);
	}

	@Override
	public CheckOutAction getCheckOutAction() {
		if(checkOutActionList != null && checkOutActionList.size() > 0) {
			return checkOutActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCheckOutAction(CheckOutAction checkOutAction) {
		if(checkOutActionList == null) {
			checkOutActionList = new ArrayList<>();
		}
		if(checkOutActionList.size() == 0) {
			checkOutActionList.add(checkOutAction);
		} else {
			checkOutActionList.set(0, checkOutAction);
		}
	}

	@Override
	public List<CheckOutAction> getCheckOutActionList() {
		return checkOutActionList;
	}

	@Override
	public void setCheckOutActionList(List<CheckOutAction> checkOutActionList) {
		this.checkOutActionList = checkOutActionList;
	}

	@Override
	public boolean hasCheckOutAction() {
		return checkOutActionList != null && checkOutActionList.size() > 0 && checkOutActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ChooseAction chooseAction) {
		chooseActionList = new ArrayList<ChooseAction>();
		chooseActionList.add(chooseAction);
	}

	@Override
	public ChooseAction getChooseAction() {
		if(chooseActionList != null && chooseActionList.size() > 0) {
			return chooseActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setChooseAction(ChooseAction chooseAction) {
		if(chooseActionList == null) {
			chooseActionList = new ArrayList<>();
		}
		if(chooseActionList.size() == 0) {
			chooseActionList.add(chooseAction);
		} else {
			chooseActionList.set(0, chooseAction);
		}
	}

	@Override
	public List<ChooseAction> getChooseActionList() {
		return chooseActionList;
	}

	@Override
	public void setChooseActionList(List<ChooseAction> chooseActionList) {
		this.chooseActionList = chooseActionList;
	}

	@Override
	public boolean hasChooseAction() {
		return chooseActionList != null && chooseActionList.size() > 0 && chooseActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(CommentAction commentAction) {
		commentActionList = new ArrayList<CommentAction>();
		commentActionList.add(commentAction);
	}

	@Override
	public CommentAction getCommentAction() {
		if(commentActionList != null && commentActionList.size() > 0) {
			return commentActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCommentAction(CommentAction commentAction) {
		if(commentActionList == null) {
			commentActionList = new ArrayList<>();
		}
		if(commentActionList.size() == 0) {
			commentActionList.add(commentAction);
		} else {
			commentActionList.set(0, commentAction);
		}
	}

	@Override
	public List<CommentAction> getCommentActionList() {
		return commentActionList;
	}

	@Override
	public void setCommentActionList(List<CommentAction> commentActionList) {
		this.commentActionList = commentActionList;
	}

	@Override
	public boolean hasCommentAction() {
		return commentActionList != null && commentActionList.size() > 0 && commentActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(CommunicateAction communicateAction) {
		communicateActionList = new ArrayList<CommunicateAction>();
		communicateActionList.add(communicateAction);
	}

	@Override
	public CommunicateAction getCommunicateAction() {
		if(communicateActionList != null && communicateActionList.size() > 0) {
			return communicateActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCommunicateAction(CommunicateAction communicateAction) {
		if(communicateActionList == null) {
			communicateActionList = new ArrayList<>();
		}
		if(communicateActionList.size() == 0) {
			communicateActionList.add(communicateAction);
		} else {
			communicateActionList.set(0, communicateAction);
		}
	}

	@Override
	public List<CommunicateAction> getCommunicateActionList() {
		return communicateActionList;
	}

	@Override
	public void setCommunicateActionList(List<CommunicateAction> communicateActionList) {
		this.communicateActionList = communicateActionList;
	}

	@Override
	public boolean hasCommunicateAction() {
		return communicateActionList != null && communicateActionList.size() > 0 && communicateActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ConfirmAction confirmAction) {
		confirmActionList = new ArrayList<ConfirmAction>();
		confirmActionList.add(confirmAction);
	}

	@Override
	public ConfirmAction getConfirmAction() {
		if(confirmActionList != null && confirmActionList.size() > 0) {
			return confirmActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setConfirmAction(ConfirmAction confirmAction) {
		if(confirmActionList == null) {
			confirmActionList = new ArrayList<>();
		}
		if(confirmActionList.size() == 0) {
			confirmActionList.add(confirmAction);
		} else {
			confirmActionList.set(0, confirmAction);
		}
	}

	@Override
	public List<ConfirmAction> getConfirmActionList() {
		return confirmActionList;
	}

	@Override
	public void setConfirmActionList(List<ConfirmAction> confirmActionList) {
		this.confirmActionList = confirmActionList;
	}

	@Override
	public boolean hasConfirmAction() {
		return confirmActionList != null && confirmActionList.size() > 0 && confirmActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ConsumeAction consumeAction) {
		consumeActionList = new ArrayList<ConsumeAction>();
		consumeActionList.add(consumeAction);
	}

	@Override
	public ConsumeAction getConsumeAction() {
		if(consumeActionList != null && consumeActionList.size() > 0) {
			return consumeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setConsumeAction(ConsumeAction consumeAction) {
		if(consumeActionList == null) {
			consumeActionList = new ArrayList<>();
		}
		if(consumeActionList.size() == 0) {
			consumeActionList.add(consumeAction);
		} else {
			consumeActionList.set(0, consumeAction);
		}
	}

	@Override
	public List<ConsumeAction> getConsumeActionList() {
		return consumeActionList;
	}

	@Override
	public void setConsumeActionList(List<ConsumeAction> consumeActionList) {
		this.consumeActionList = consumeActionList;
	}

	@Override
	public boolean hasConsumeAction() {
		return consumeActionList != null && consumeActionList.size() > 0 && consumeActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ControlAction controlAction) {
		controlActionList = new ArrayList<ControlAction>();
		controlActionList.add(controlAction);
	}

	@Override
	public ControlAction getControlAction() {
		if(controlActionList != null && controlActionList.size() > 0) {
			return controlActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setControlAction(ControlAction controlAction) {
		if(controlActionList == null) {
			controlActionList = new ArrayList<>();
		}
		if(controlActionList.size() == 0) {
			controlActionList.add(controlAction);
		} else {
			controlActionList.set(0, controlAction);
		}
	}

	@Override
	public List<ControlAction> getControlActionList() {
		return controlActionList;
	}

	@Override
	public void setControlActionList(List<ControlAction> controlActionList) {
		this.controlActionList = controlActionList;
	}

	@Override
	public boolean hasControlAction() {
		return controlActionList != null && controlActionList.size() > 0 && controlActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(CookAction cookAction) {
		cookActionList = new ArrayList<CookAction>();
		cookActionList.add(cookAction);
	}

	@Override
	public CookAction getCookAction() {
		if(cookActionList != null && cookActionList.size() > 0) {
			return cookActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCookAction(CookAction cookAction) {
		if(cookActionList == null) {
			cookActionList = new ArrayList<>();
		}
		if(cookActionList.size() == 0) {
			cookActionList.add(cookAction);
		} else {
			cookActionList.set(0, cookAction);
		}
	}

	@Override
	public List<CookAction> getCookActionList() {
		return cookActionList;
	}

	@Override
	public void setCookActionList(List<CookAction> cookActionList) {
		this.cookActionList = cookActionList;
	}

	@Override
	public boolean hasCookAction() {
		return cookActionList != null && cookActionList.size() > 0 && cookActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(CreateAction createAction) {
		createActionList = new ArrayList<CreateAction>();
		createActionList.add(createAction);
	}

	@Override
	public CreateAction getCreateAction() {
		if(createActionList != null && createActionList.size() > 0) {
			return createActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setCreateAction(CreateAction createAction) {
		if(createActionList == null) {
			createActionList = new ArrayList<>();
		}
		if(createActionList.size() == 0) {
			createActionList.add(createAction);
		} else {
			createActionList.set(0, createAction);
		}
	}

	@Override
	public List<CreateAction> getCreateActionList() {
		return createActionList;
	}

	@Override
	public void setCreateActionList(List<CreateAction> createActionList) {
		this.createActionList = createActionList;
	}

	@Override
	public boolean hasCreateAction() {
		return createActionList != null && createActionList.size() > 0 && createActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(DeactivateAction deactivateAction) {
		deactivateActionList = new ArrayList<DeactivateAction>();
		deactivateActionList.add(deactivateAction);
	}

	@Override
	public DeactivateAction getDeactivateAction() {
		if(deactivateActionList != null && deactivateActionList.size() > 0) {
			return deactivateActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDeactivateAction(DeactivateAction deactivateAction) {
		if(deactivateActionList == null) {
			deactivateActionList = new ArrayList<>();
		}
		if(deactivateActionList.size() == 0) {
			deactivateActionList.add(deactivateAction);
		} else {
			deactivateActionList.set(0, deactivateAction);
		}
	}

	@Override
	public List<DeactivateAction> getDeactivateActionList() {
		return deactivateActionList;
	}

	@Override
	public void setDeactivateActionList(List<DeactivateAction> deactivateActionList) {
		this.deactivateActionList = deactivateActionList;
	}

	@Override
	public boolean hasDeactivateAction() {
		return deactivateActionList != null && deactivateActionList.size() > 0 && deactivateActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(DeleteAction deleteAction) {
		deleteActionList = new ArrayList<DeleteAction>();
		deleteActionList.add(deleteAction);
	}

	@Override
	public DeleteAction getDeleteAction() {
		if(deleteActionList != null && deleteActionList.size() > 0) {
			return deleteActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDeleteAction(DeleteAction deleteAction) {
		if(deleteActionList == null) {
			deleteActionList = new ArrayList<>();
		}
		if(deleteActionList.size() == 0) {
			deleteActionList.add(deleteAction);
		} else {
			deleteActionList.set(0, deleteAction);
		}
	}

	@Override
	public List<DeleteAction> getDeleteActionList() {
		return deleteActionList;
	}

	@Override
	public void setDeleteActionList(List<DeleteAction> deleteActionList) {
		this.deleteActionList = deleteActionList;
	}

	@Override
	public boolean hasDeleteAction() {
		return deleteActionList != null && deleteActionList.size() > 0 && deleteActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(DepartAction departAction) {
		departActionList = new ArrayList<DepartAction>();
		departActionList.add(departAction);
	}

	@Override
	public DepartAction getDepartAction() {
		if(departActionList != null && departActionList.size() > 0) {
			return departActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDepartAction(DepartAction departAction) {
		if(departActionList == null) {
			departActionList = new ArrayList<>();
		}
		if(departActionList.size() == 0) {
			departActionList.add(departAction);
		} else {
			departActionList.set(0, departAction);
		}
	}

	@Override
	public List<DepartAction> getDepartActionList() {
		return departActionList;
	}

	@Override
	public void setDepartActionList(List<DepartAction> departActionList) {
		this.departActionList = departActionList;
	}

	@Override
	public boolean hasDepartAction() {
		return departActionList != null && departActionList.size() > 0 && departActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(DisagreeAction disagreeAction) {
		disagreeActionList = new ArrayList<DisagreeAction>();
		disagreeActionList.add(disagreeAction);
	}

	@Override
	public DisagreeAction getDisagreeAction() {
		if(disagreeActionList != null && disagreeActionList.size() > 0) {
			return disagreeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDisagreeAction(DisagreeAction disagreeAction) {
		if(disagreeActionList == null) {
			disagreeActionList = new ArrayList<>();
		}
		if(disagreeActionList.size() == 0) {
			disagreeActionList.add(disagreeAction);
		} else {
			disagreeActionList.set(0, disagreeAction);
		}
	}

	@Override
	public List<DisagreeAction> getDisagreeActionList() {
		return disagreeActionList;
	}

	@Override
	public void setDisagreeActionList(List<DisagreeAction> disagreeActionList) {
		this.disagreeActionList = disagreeActionList;
	}

	@Override
	public boolean hasDisagreeAction() {
		return disagreeActionList != null && disagreeActionList.size() > 0 && disagreeActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(DiscoverAction discoverAction) {
		discoverActionList = new ArrayList<DiscoverAction>();
		discoverActionList.add(discoverAction);
	}

	@Override
	public DiscoverAction getDiscoverAction() {
		if(discoverActionList != null && discoverActionList.size() > 0) {
			return discoverActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDiscoverAction(DiscoverAction discoverAction) {
		if(discoverActionList == null) {
			discoverActionList = new ArrayList<>();
		}
		if(discoverActionList.size() == 0) {
			discoverActionList.add(discoverAction);
		} else {
			discoverActionList.set(0, discoverAction);
		}
	}

	@Override
	public List<DiscoverAction> getDiscoverActionList() {
		return discoverActionList;
	}

	@Override
	public void setDiscoverActionList(List<DiscoverAction> discoverActionList) {
		this.discoverActionList = discoverActionList;
	}

	@Override
	public boolean hasDiscoverAction() {
		return discoverActionList != null && discoverActionList.size() > 0 && discoverActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(DislikeAction dislikeAction) {
		dislikeActionList = new ArrayList<DislikeAction>();
		dislikeActionList.add(dislikeAction);
	}

	@Override
	public DislikeAction getDislikeAction() {
		if(dislikeActionList != null && dislikeActionList.size() > 0) {
			return dislikeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDislikeAction(DislikeAction dislikeAction) {
		if(dislikeActionList == null) {
			dislikeActionList = new ArrayList<>();
		}
		if(dislikeActionList.size() == 0) {
			dislikeActionList.add(dislikeAction);
		} else {
			dislikeActionList.set(0, dislikeAction);
		}
	}

	@Override
	public List<DislikeAction> getDislikeActionList() {
		return dislikeActionList;
	}

	@Override
	public void setDislikeActionList(List<DislikeAction> dislikeActionList) {
		this.dislikeActionList = dislikeActionList;
	}

	@Override
	public boolean hasDislikeAction() {
		return dislikeActionList != null && dislikeActionList.size() > 0 && dislikeActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(DonateAction donateAction) {
		donateActionList = new ArrayList<DonateAction>();
		donateActionList.add(donateAction);
	}

	@Override
	public DonateAction getDonateAction() {
		if(donateActionList != null && donateActionList.size() > 0) {
			return donateActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDonateAction(DonateAction donateAction) {
		if(donateActionList == null) {
			donateActionList = new ArrayList<>();
		}
		if(donateActionList.size() == 0) {
			donateActionList.add(donateAction);
		} else {
			donateActionList.set(0, donateAction);
		}
	}

	@Override
	public List<DonateAction> getDonateActionList() {
		return donateActionList;
	}

	@Override
	public void setDonateActionList(List<DonateAction> donateActionList) {
		this.donateActionList = donateActionList;
	}

	@Override
	public boolean hasDonateAction() {
		return donateActionList != null && donateActionList.size() > 0 && donateActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(DownloadAction downloadAction) {
		downloadActionList = new ArrayList<DownloadAction>();
		downloadActionList.add(downloadAction);
	}

	@Override
	public DownloadAction getDownloadAction() {
		if(downloadActionList != null && downloadActionList.size() > 0) {
			return downloadActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDownloadAction(DownloadAction downloadAction) {
		if(downloadActionList == null) {
			downloadActionList = new ArrayList<>();
		}
		if(downloadActionList.size() == 0) {
			downloadActionList.add(downloadAction);
		} else {
			downloadActionList.set(0, downloadAction);
		}
	}

	@Override
	public List<DownloadAction> getDownloadActionList() {
		return downloadActionList;
	}

	@Override
	public void setDownloadActionList(List<DownloadAction> downloadActionList) {
		this.downloadActionList = downloadActionList;
	}

	@Override
	public boolean hasDownloadAction() {
		return downloadActionList != null && downloadActionList.size() > 0 && downloadActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(DrawAction drawAction) {
		drawActionList = new ArrayList<DrawAction>();
		drawActionList.add(drawAction);
	}

	@Override
	public DrawAction getDrawAction() {
		if(drawActionList != null && drawActionList.size() > 0) {
			return drawActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrawAction(DrawAction drawAction) {
		if(drawActionList == null) {
			drawActionList = new ArrayList<>();
		}
		if(drawActionList.size() == 0) {
			drawActionList.add(drawAction);
		} else {
			drawActionList.set(0, drawAction);
		}
	}

	@Override
	public List<DrawAction> getDrawActionList() {
		return drawActionList;
	}

	@Override
	public void setDrawActionList(List<DrawAction> drawActionList) {
		this.drawActionList = drawActionList;
	}

	@Override
	public boolean hasDrawAction() {
		return drawActionList != null && drawActionList.size() > 0 && drawActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(DrinkAction drinkAction) {
		drinkActionList = new ArrayList<DrinkAction>();
		drinkActionList.add(drinkAction);
	}

	@Override
	public DrinkAction getDrinkAction() {
		if(drinkActionList != null && drinkActionList.size() > 0) {
			return drinkActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setDrinkAction(DrinkAction drinkAction) {
		if(drinkActionList == null) {
			drinkActionList = new ArrayList<>();
		}
		if(drinkActionList.size() == 0) {
			drinkActionList.add(drinkAction);
		} else {
			drinkActionList.set(0, drinkAction);
		}
	}

	@Override
	public List<DrinkAction> getDrinkActionList() {
		return drinkActionList;
	}

	@Override
	public void setDrinkActionList(List<DrinkAction> drinkActionList) {
		this.drinkActionList = drinkActionList;
	}

	@Override
	public boolean hasDrinkAction() {
		return drinkActionList != null && drinkActionList.size() > 0 && drinkActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(EatAction eatAction) {
		eatActionList = new ArrayList<EatAction>();
		eatActionList.add(eatAction);
	}

	@Override
	public EatAction getEatAction() {
		if(eatActionList != null && eatActionList.size() > 0) {
			return eatActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEatAction(EatAction eatAction) {
		if(eatActionList == null) {
			eatActionList = new ArrayList<>();
		}
		if(eatActionList.size() == 0) {
			eatActionList.add(eatAction);
		} else {
			eatActionList.set(0, eatAction);
		}
	}

	@Override
	public List<EatAction> getEatActionList() {
		return eatActionList;
	}

	@Override
	public void setEatActionList(List<EatAction> eatActionList) {
		this.eatActionList = eatActionList;
	}

	@Override
	public boolean hasEatAction() {
		return eatActionList != null && eatActionList.size() > 0 && eatActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(EndorseAction endorseAction) {
		endorseActionList = new ArrayList<EndorseAction>();
		endorseActionList.add(endorseAction);
	}

	@Override
	public EndorseAction getEndorseAction() {
		if(endorseActionList != null && endorseActionList.size() > 0) {
			return endorseActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setEndorseAction(EndorseAction endorseAction) {
		if(endorseActionList == null) {
			endorseActionList = new ArrayList<>();
		}
		if(endorseActionList.size() == 0) {
			endorseActionList.add(endorseAction);
		} else {
			endorseActionList.set(0, endorseAction);
		}
	}

	@Override
	public List<EndorseAction> getEndorseActionList() {
		return endorseActionList;
	}

	@Override
	public void setEndorseActionList(List<EndorseAction> endorseActionList) {
		this.endorseActionList = endorseActionList;
	}

	@Override
	public boolean hasEndorseAction() {
		return endorseActionList != null && endorseActionList.size() > 0 && endorseActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ExerciseAction exerciseAction) {
		exerciseActionList = new ArrayList<ExerciseAction>();
		exerciseActionList.add(exerciseAction);
	}

	@Override
	public ExerciseAction getExerciseAction() {
		if(exerciseActionList != null && exerciseActionList.size() > 0) {
			return exerciseActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setExerciseAction(ExerciseAction exerciseAction) {
		if(exerciseActionList == null) {
			exerciseActionList = new ArrayList<>();
		}
		if(exerciseActionList.size() == 0) {
			exerciseActionList.add(exerciseAction);
		} else {
			exerciseActionList.set(0, exerciseAction);
		}
	}

	@Override
	public List<ExerciseAction> getExerciseActionList() {
		return exerciseActionList;
	}

	@Override
	public void setExerciseActionList(List<ExerciseAction> exerciseActionList) {
		this.exerciseActionList = exerciseActionList;
	}

	@Override
	public boolean hasExerciseAction() {
		return exerciseActionList != null && exerciseActionList.size() > 0 && exerciseActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(FilmAction filmAction) {
		filmActionList = new ArrayList<FilmAction>();
		filmActionList.add(filmAction);
	}

	@Override
	public FilmAction getFilmAction() {
		if(filmActionList != null && filmActionList.size() > 0) {
			return filmActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFilmAction(FilmAction filmAction) {
		if(filmActionList == null) {
			filmActionList = new ArrayList<>();
		}
		if(filmActionList.size() == 0) {
			filmActionList.add(filmAction);
		} else {
			filmActionList.set(0, filmAction);
		}
	}

	@Override
	public List<FilmAction> getFilmActionList() {
		return filmActionList;
	}

	@Override
	public void setFilmActionList(List<FilmAction> filmActionList) {
		this.filmActionList = filmActionList;
	}

	@Override
	public boolean hasFilmAction() {
		return filmActionList != null && filmActionList.size() > 0 && filmActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(FindAction findAction) {
		findActionList = new ArrayList<FindAction>();
		findActionList.add(findAction);
	}

	@Override
	public FindAction getFindAction() {
		if(findActionList != null && findActionList.size() > 0) {
			return findActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFindAction(FindAction findAction) {
		if(findActionList == null) {
			findActionList = new ArrayList<>();
		}
		if(findActionList.size() == 0) {
			findActionList.add(findAction);
		} else {
			findActionList.set(0, findAction);
		}
	}

	@Override
	public List<FindAction> getFindActionList() {
		return findActionList;
	}

	@Override
	public void setFindActionList(List<FindAction> findActionList) {
		this.findActionList = findActionList;
	}

	@Override
	public boolean hasFindAction() {
		return findActionList != null && findActionList.size() > 0 && findActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(FollowAction followAction) {
		followActionList = new ArrayList<FollowAction>();
		followActionList.add(followAction);
	}

	@Override
	public FollowAction getFollowAction() {
		if(followActionList != null && followActionList.size() > 0) {
			return followActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setFollowAction(FollowAction followAction) {
		if(followActionList == null) {
			followActionList = new ArrayList<>();
		}
		if(followActionList.size() == 0) {
			followActionList.add(followAction);
		} else {
			followActionList.set(0, followAction);
		}
	}

	@Override
	public List<FollowAction> getFollowActionList() {
		return followActionList;
	}

	@Override
	public void setFollowActionList(List<FollowAction> followActionList) {
		this.followActionList = followActionList;
	}

	@Override
	public boolean hasFollowAction() {
		return followActionList != null && followActionList.size() > 0 && followActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(GiveAction giveAction) {
		giveActionList = new ArrayList<GiveAction>();
		giveActionList.add(giveAction);
	}

	@Override
	public GiveAction getGiveAction() {
		if(giveActionList != null && giveActionList.size() > 0) {
			return giveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGiveAction(GiveAction giveAction) {
		if(giveActionList == null) {
			giveActionList = new ArrayList<>();
		}
		if(giveActionList.size() == 0) {
			giveActionList.add(giveAction);
		} else {
			giveActionList.set(0, giveAction);
		}
	}

	@Override
	public List<GiveAction> getGiveActionList() {
		return giveActionList;
	}

	@Override
	public void setGiveActionList(List<GiveAction> giveActionList) {
		this.giveActionList = giveActionList;
	}

	@Override
	public boolean hasGiveAction() {
		return giveActionList != null && giveActionList.size() > 0 && giveActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(IgnoreAction ignoreAction) {
		ignoreActionList = new ArrayList<IgnoreAction>();
		ignoreActionList.add(ignoreAction);
	}

	@Override
	public IgnoreAction getIgnoreAction() {
		if(ignoreActionList != null && ignoreActionList.size() > 0) {
			return ignoreActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setIgnoreAction(IgnoreAction ignoreAction) {
		if(ignoreActionList == null) {
			ignoreActionList = new ArrayList<>();
		}
		if(ignoreActionList.size() == 0) {
			ignoreActionList.add(ignoreAction);
		} else {
			ignoreActionList.set(0, ignoreAction);
		}
	}

	@Override
	public List<IgnoreAction> getIgnoreActionList() {
		return ignoreActionList;
	}

	@Override
	public void setIgnoreActionList(List<IgnoreAction> ignoreActionList) {
		this.ignoreActionList = ignoreActionList;
	}

	@Override
	public boolean hasIgnoreAction() {
		return ignoreActionList != null && ignoreActionList.size() > 0 && ignoreActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(InformAction informAction) {
		informActionList = new ArrayList<InformAction>();
		informActionList.add(informAction);
	}

	@Override
	public InformAction getInformAction() {
		if(informActionList != null && informActionList.size() > 0) {
			return informActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInformAction(InformAction informAction) {
		if(informActionList == null) {
			informActionList = new ArrayList<>();
		}
		if(informActionList.size() == 0) {
			informActionList.add(informAction);
		} else {
			informActionList.set(0, informAction);
		}
	}

	@Override
	public List<InformAction> getInformActionList() {
		return informActionList;
	}

	@Override
	public void setInformActionList(List<InformAction> informActionList) {
		this.informActionList = informActionList;
	}

	@Override
	public boolean hasInformAction() {
		return informActionList != null && informActionList.size() > 0 && informActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(InsertAction insertAction) {
		insertActionList = new ArrayList<InsertAction>();
		insertActionList.add(insertAction);
	}

	@Override
	public InsertAction getInsertAction() {
		if(insertActionList != null && insertActionList.size() > 0) {
			return insertActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInsertAction(InsertAction insertAction) {
		if(insertActionList == null) {
			insertActionList = new ArrayList<>();
		}
		if(insertActionList.size() == 0) {
			insertActionList.add(insertAction);
		} else {
			insertActionList.set(0, insertAction);
		}
	}

	@Override
	public List<InsertAction> getInsertActionList() {
		return insertActionList;
	}

	@Override
	public void setInsertActionList(List<InsertAction> insertActionList) {
		this.insertActionList = insertActionList;
	}

	@Override
	public boolean hasInsertAction() {
		return insertActionList != null && insertActionList.size() > 0 && insertActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(InstallAction installAction) {
		installActionList = new ArrayList<InstallAction>();
		installActionList.add(installAction);
	}

	@Override
	public InstallAction getInstallAction() {
		if(installActionList != null && installActionList.size() > 0) {
			return installActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInstallAction(InstallAction installAction) {
		if(installActionList == null) {
			installActionList = new ArrayList<>();
		}
		if(installActionList.size() == 0) {
			installActionList.add(installAction);
		} else {
			installActionList.set(0, installAction);
		}
	}

	@Override
	public List<InstallAction> getInstallActionList() {
		return installActionList;
	}

	@Override
	public void setInstallActionList(List<InstallAction> installActionList) {
		this.installActionList = installActionList;
	}

	@Override
	public boolean hasInstallAction() {
		return installActionList != null && installActionList.size() > 0 && installActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(InteractAction interactAction) {
		interactActionList = new ArrayList<InteractAction>();
		interactActionList.add(interactAction);
	}

	@Override
	public InteractAction getInteractAction() {
		if(interactActionList != null && interactActionList.size() > 0) {
			return interactActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInteractAction(InteractAction interactAction) {
		if(interactActionList == null) {
			interactActionList = new ArrayList<>();
		}
		if(interactActionList.size() == 0) {
			interactActionList.add(interactAction);
		} else {
			interactActionList.set(0, interactAction);
		}
	}

	@Override
	public List<InteractAction> getInteractActionList() {
		return interactActionList;
	}

	@Override
	public void setInteractActionList(List<InteractAction> interactActionList) {
		this.interactActionList = interactActionList;
	}

	@Override
	public boolean hasInteractAction() {
		return interactActionList != null && interactActionList.size() > 0 && interactActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(InviteAction inviteAction) {
		inviteActionList = new ArrayList<InviteAction>();
		inviteActionList.add(inviteAction);
	}

	@Override
	public InviteAction getInviteAction() {
		if(inviteActionList != null && inviteActionList.size() > 0) {
			return inviteActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setInviteAction(InviteAction inviteAction) {
		if(inviteActionList == null) {
			inviteActionList = new ArrayList<>();
		}
		if(inviteActionList.size() == 0) {
			inviteActionList.add(inviteAction);
		} else {
			inviteActionList.set(0, inviteAction);
		}
	}

	@Override
	public List<InviteAction> getInviteActionList() {
		return inviteActionList;
	}

	@Override
	public void setInviteActionList(List<InviteAction> inviteActionList) {
		this.inviteActionList = inviteActionList;
	}

	@Override
	public boolean hasInviteAction() {
		return inviteActionList != null && inviteActionList.size() > 0 && inviteActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(JoinAction joinAction) {
		joinActionList = new ArrayList<JoinAction>();
		joinActionList.add(joinAction);
	}

	@Override
	public JoinAction getJoinAction() {
		if(joinActionList != null && joinActionList.size() > 0) {
			return joinActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setJoinAction(JoinAction joinAction) {
		if(joinActionList == null) {
			joinActionList = new ArrayList<>();
		}
		if(joinActionList.size() == 0) {
			joinActionList.add(joinAction);
		} else {
			joinActionList.set(0, joinAction);
		}
	}

	@Override
	public List<JoinAction> getJoinActionList() {
		return joinActionList;
	}

	@Override
	public void setJoinActionList(List<JoinAction> joinActionList) {
		this.joinActionList = joinActionList;
	}

	@Override
	public boolean hasJoinAction() {
		return joinActionList != null && joinActionList.size() > 0 && joinActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(LeaveAction leaveAction) {
		leaveActionList = new ArrayList<LeaveAction>();
		leaveActionList.add(leaveAction);
	}

	@Override
	public LeaveAction getLeaveAction() {
		if(leaveActionList != null && leaveActionList.size() > 0) {
			return leaveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLeaveAction(LeaveAction leaveAction) {
		if(leaveActionList == null) {
			leaveActionList = new ArrayList<>();
		}
		if(leaveActionList.size() == 0) {
			leaveActionList.add(leaveAction);
		} else {
			leaveActionList.set(0, leaveAction);
		}
	}

	@Override
	public List<LeaveAction> getLeaveActionList() {
		return leaveActionList;
	}

	@Override
	public void setLeaveActionList(List<LeaveAction> leaveActionList) {
		this.leaveActionList = leaveActionList;
	}

	@Override
	public boolean hasLeaveAction() {
		return leaveActionList != null && leaveActionList.size() > 0 && leaveActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(LendAction lendAction) {
		lendActionList = new ArrayList<LendAction>();
		lendActionList.add(lendAction);
	}

	@Override
	public LendAction getLendAction() {
		if(lendActionList != null && lendActionList.size() > 0) {
			return lendActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLendAction(LendAction lendAction) {
		if(lendActionList == null) {
			lendActionList = new ArrayList<>();
		}
		if(lendActionList.size() == 0) {
			lendActionList.add(lendAction);
		} else {
			lendActionList.set(0, lendAction);
		}
	}

	@Override
	public List<LendAction> getLendActionList() {
		return lendActionList;
	}

	@Override
	public void setLendActionList(List<LendAction> lendActionList) {
		this.lendActionList = lendActionList;
	}

	@Override
	public boolean hasLendAction() {
		return lendActionList != null && lendActionList.size() > 0 && lendActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(LikeAction likeAction) {
		likeActionList = new ArrayList<LikeAction>();
		likeActionList.add(likeAction);
	}

	@Override
	public LikeAction getLikeAction() {
		if(likeActionList != null && likeActionList.size() > 0) {
			return likeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLikeAction(LikeAction likeAction) {
		if(likeActionList == null) {
			likeActionList = new ArrayList<>();
		}
		if(likeActionList.size() == 0) {
			likeActionList.add(likeAction);
		} else {
			likeActionList.set(0, likeAction);
		}
	}

	@Override
	public List<LikeAction> getLikeActionList() {
		return likeActionList;
	}

	@Override
	public void setLikeActionList(List<LikeAction> likeActionList) {
		this.likeActionList = likeActionList;
	}

	@Override
	public boolean hasLikeAction() {
		return likeActionList != null && likeActionList.size() > 0 && likeActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ListenAction listenAction) {
		listenActionList = new ArrayList<ListenAction>();
		listenActionList.add(listenAction);
	}

	@Override
	public ListenAction getListenAction() {
		if(listenActionList != null && listenActionList.size() > 0) {
			return listenActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setListenAction(ListenAction listenAction) {
		if(listenActionList == null) {
			listenActionList = new ArrayList<>();
		}
		if(listenActionList.size() == 0) {
			listenActionList.add(listenAction);
		} else {
			listenActionList.set(0, listenAction);
		}
	}

	@Override
	public List<ListenAction> getListenActionList() {
		return listenActionList;
	}

	@Override
	public void setListenActionList(List<ListenAction> listenActionList) {
		this.listenActionList = listenActionList;
	}

	@Override
	public boolean hasListenAction() {
		return listenActionList != null && listenActionList.size() > 0 && listenActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(LoseAction loseAction) {
		loseActionList = new ArrayList<LoseAction>();
		loseActionList.add(loseAction);
	}

	@Override
	public LoseAction getLoseAction() {
		if(loseActionList != null && loseActionList.size() > 0) {
			return loseActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setLoseAction(LoseAction loseAction) {
		if(loseActionList == null) {
			loseActionList = new ArrayList<>();
		}
		if(loseActionList.size() == 0) {
			loseActionList.add(loseAction);
		} else {
			loseActionList.set(0, loseAction);
		}
	}

	@Override
	public List<LoseAction> getLoseActionList() {
		return loseActionList;
	}

	@Override
	public void setLoseActionList(List<LoseAction> loseActionList) {
		this.loseActionList = loseActionList;
	}

	@Override
	public boolean hasLoseAction() {
		return loseActionList != null && loseActionList.size() > 0 && loseActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(MarryAction marryAction) {
		marryActionList = new ArrayList<MarryAction>();
		marryActionList.add(marryAction);
	}

	@Override
	public MarryAction getMarryAction() {
		if(marryActionList != null && marryActionList.size() > 0) {
			return marryActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMarryAction(MarryAction marryAction) {
		if(marryActionList == null) {
			marryActionList = new ArrayList<>();
		}
		if(marryActionList.size() == 0) {
			marryActionList.add(marryAction);
		} else {
			marryActionList.set(0, marryAction);
		}
	}

	@Override
	public List<MarryAction> getMarryActionList() {
		return marryActionList;
	}

	@Override
	public void setMarryActionList(List<MarryAction> marryActionList) {
		this.marryActionList = marryActionList;
	}

	@Override
	public boolean hasMarryAction() {
		return marryActionList != null && marryActionList.size() > 0 && marryActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(MoneyTransfer moneyTransfer) {
		moneyTransferList = new ArrayList<MoneyTransfer>();
		moneyTransferList.add(moneyTransfer);
	}

	@Override
	public MoneyTransfer getMoneyTransfer() {
		if(moneyTransferList != null && moneyTransferList.size() > 0) {
			return moneyTransferList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMoneyTransfer(MoneyTransfer moneyTransfer) {
		if(moneyTransferList == null) {
			moneyTransferList = new ArrayList<>();
		}
		if(moneyTransferList.size() == 0) {
			moneyTransferList.add(moneyTransfer);
		} else {
			moneyTransferList.set(0, moneyTransfer);
		}
	}

	@Override
	public List<MoneyTransfer> getMoneyTransferList() {
		return moneyTransferList;
	}

	@Override
	public void setMoneyTransferList(List<MoneyTransfer> moneyTransferList) {
		this.moneyTransferList = moneyTransferList;
	}

	@Override
	public boolean hasMoneyTransfer() {
		return moneyTransferList != null && moneyTransferList.size() > 0 && moneyTransferList.get(0) != null;
	}

	public POTENTIAL_ACTION(MoveAction moveAction) {
		moveActionList = new ArrayList<MoveAction>();
		moveActionList.add(moveAction);
	}

	@Override
	public MoveAction getMoveAction() {
		if(moveActionList != null && moveActionList.size() > 0) {
			return moveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setMoveAction(MoveAction moveAction) {
		if(moveActionList == null) {
			moveActionList = new ArrayList<>();
		}
		if(moveActionList.size() == 0) {
			moveActionList.add(moveAction);
		} else {
			moveActionList.set(0, moveAction);
		}
	}

	@Override
	public List<MoveAction> getMoveActionList() {
		return moveActionList;
	}

	@Override
	public void setMoveActionList(List<MoveAction> moveActionList) {
		this.moveActionList = moveActionList;
	}

	@Override
	public boolean hasMoveAction() {
		return moveActionList != null && moveActionList.size() > 0 && moveActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(OrderAction orderAction) {
		orderActionList = new ArrayList<OrderAction>();
		orderActionList.add(orderAction);
	}

	@Override
	public OrderAction getOrderAction() {
		if(orderActionList != null && orderActionList.size() > 0) {
			return orderActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrderAction(OrderAction orderAction) {
		if(orderActionList == null) {
			orderActionList = new ArrayList<>();
		}
		if(orderActionList.size() == 0) {
			orderActionList.add(orderAction);
		} else {
			orderActionList.set(0, orderAction);
		}
	}

	@Override
	public List<OrderAction> getOrderActionList() {
		return orderActionList;
	}

	@Override
	public void setOrderActionList(List<OrderAction> orderActionList) {
		this.orderActionList = orderActionList;
	}

	@Override
	public boolean hasOrderAction() {
		return orderActionList != null && orderActionList.size() > 0 && orderActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(OrganizeAction organizeAction) {
		organizeActionList = new ArrayList<OrganizeAction>();
		organizeActionList.add(organizeAction);
	}

	@Override
	public OrganizeAction getOrganizeAction() {
		if(organizeActionList != null && organizeActionList.size() > 0) {
			return organizeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOrganizeAction(OrganizeAction organizeAction) {
		if(organizeActionList == null) {
			organizeActionList = new ArrayList<>();
		}
		if(organizeActionList.size() == 0) {
			organizeActionList.add(organizeAction);
		} else {
			organizeActionList.set(0, organizeAction);
		}
	}

	@Override
	public List<OrganizeAction> getOrganizeActionList() {
		return organizeActionList;
	}

	@Override
	public void setOrganizeActionList(List<OrganizeAction> organizeActionList) {
		this.organizeActionList = organizeActionList;
	}

	@Override
	public boolean hasOrganizeAction() {
		return organizeActionList != null && organizeActionList.size() > 0 && organizeActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(PaintAction paintAction) {
		paintActionList = new ArrayList<PaintAction>();
		paintActionList.add(paintAction);
	}

	@Override
	public PaintAction getPaintAction() {
		if(paintActionList != null && paintActionList.size() > 0) {
			return paintActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPaintAction(PaintAction paintAction) {
		if(paintActionList == null) {
			paintActionList = new ArrayList<>();
		}
		if(paintActionList.size() == 0) {
			paintActionList.add(paintAction);
		} else {
			paintActionList.set(0, paintAction);
		}
	}

	@Override
	public List<PaintAction> getPaintActionList() {
		return paintActionList;
	}

	@Override
	public void setPaintActionList(List<PaintAction> paintActionList) {
		this.paintActionList = paintActionList;
	}

	@Override
	public boolean hasPaintAction() {
		return paintActionList != null && paintActionList.size() > 0 && paintActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(PayAction payAction) {
		payActionList = new ArrayList<PayAction>();
		payActionList.add(payAction);
	}

	@Override
	public PayAction getPayAction() {
		if(payActionList != null && payActionList.size() > 0) {
			return payActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPayAction(PayAction payAction) {
		if(payActionList == null) {
			payActionList = new ArrayList<>();
		}
		if(payActionList.size() == 0) {
			payActionList.add(payAction);
		} else {
			payActionList.set(0, payAction);
		}
	}

	@Override
	public List<PayAction> getPayActionList() {
		return payActionList;
	}

	@Override
	public void setPayActionList(List<PayAction> payActionList) {
		this.payActionList = payActionList;
	}

	@Override
	public boolean hasPayAction() {
		return payActionList != null && payActionList.size() > 0 && payActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(PerformAction performAction) {
		performActionList = new ArrayList<PerformAction>();
		performActionList.add(performAction);
	}

	@Override
	public PerformAction getPerformAction() {
		if(performActionList != null && performActionList.size() > 0) {
			return performActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPerformAction(PerformAction performAction) {
		if(performActionList == null) {
			performActionList = new ArrayList<>();
		}
		if(performActionList.size() == 0) {
			performActionList.add(performAction);
		} else {
			performActionList.set(0, performAction);
		}
	}

	@Override
	public List<PerformAction> getPerformActionList() {
		return performActionList;
	}

	@Override
	public void setPerformActionList(List<PerformAction> performActionList) {
		this.performActionList = performActionList;
	}

	@Override
	public boolean hasPerformAction() {
		return performActionList != null && performActionList.size() > 0 && performActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(PhotographAction photographAction) {
		photographActionList = new ArrayList<PhotographAction>();
		photographActionList.add(photographAction);
	}

	@Override
	public PhotographAction getPhotographAction() {
		if(photographActionList != null && photographActionList.size() > 0) {
			return photographActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPhotographAction(PhotographAction photographAction) {
		if(photographActionList == null) {
			photographActionList = new ArrayList<>();
		}
		if(photographActionList.size() == 0) {
			photographActionList.add(photographAction);
		} else {
			photographActionList.set(0, photographAction);
		}
	}

	@Override
	public List<PhotographAction> getPhotographActionList() {
		return photographActionList;
	}

	@Override
	public void setPhotographActionList(List<PhotographAction> photographActionList) {
		this.photographActionList = photographActionList;
	}

	@Override
	public boolean hasPhotographAction() {
		return photographActionList != null && photographActionList.size() > 0 && photographActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(PlanAction planAction) {
		planActionList = new ArrayList<PlanAction>();
		planActionList.add(planAction);
	}

	@Override
	public PlanAction getPlanAction() {
		if(planActionList != null && planActionList.size() > 0) {
			return planActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPlanAction(PlanAction planAction) {
		if(planActionList == null) {
			planActionList = new ArrayList<>();
		}
		if(planActionList.size() == 0) {
			planActionList.add(planAction);
		} else {
			planActionList.set(0, planAction);
		}
	}

	@Override
	public List<PlanAction> getPlanActionList() {
		return planActionList;
	}

	@Override
	public void setPlanActionList(List<PlanAction> planActionList) {
		this.planActionList = planActionList;
	}

	@Override
	public boolean hasPlanAction() {
		return planActionList != null && planActionList.size() > 0 && planActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(PlayAction playAction) {
		playActionList = new ArrayList<PlayAction>();
		playActionList.add(playAction);
	}

	@Override
	public PlayAction getPlayAction() {
		if(playActionList != null && playActionList.size() > 0) {
			return playActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPlayAction(PlayAction playAction) {
		if(playActionList == null) {
			playActionList = new ArrayList<>();
		}
		if(playActionList.size() == 0) {
			playActionList.add(playAction);
		} else {
			playActionList.set(0, playAction);
		}
	}

	@Override
	public List<PlayAction> getPlayActionList() {
		return playActionList;
	}

	@Override
	public void setPlayActionList(List<PlayAction> playActionList) {
		this.playActionList = playActionList;
	}

	@Override
	public boolean hasPlayAction() {
		return playActionList != null && playActionList.size() > 0 && playActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(PreOrderAction preOrderAction) {
		preOrderActionList = new ArrayList<PreOrderAction>();
		preOrderActionList.add(preOrderAction);
	}

	@Override
	public PreOrderAction getPreOrderAction() {
		if(preOrderActionList != null && preOrderActionList.size() > 0) {
			return preOrderActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPreOrderAction(PreOrderAction preOrderAction) {
		if(preOrderActionList == null) {
			preOrderActionList = new ArrayList<>();
		}
		if(preOrderActionList.size() == 0) {
			preOrderActionList.add(preOrderAction);
		} else {
			preOrderActionList.set(0, preOrderAction);
		}
	}

	@Override
	public List<PreOrderAction> getPreOrderActionList() {
		return preOrderActionList;
	}

	@Override
	public void setPreOrderActionList(List<PreOrderAction> preOrderActionList) {
		this.preOrderActionList = preOrderActionList;
	}

	@Override
	public boolean hasPreOrderAction() {
		return preOrderActionList != null && preOrderActionList.size() > 0 && preOrderActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(PrependAction prependAction) {
		prependActionList = new ArrayList<PrependAction>();
		prependActionList.add(prependAction);
	}

	@Override
	public PrependAction getPrependAction() {
		if(prependActionList != null && prependActionList.size() > 0) {
			return prependActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setPrependAction(PrependAction prependAction) {
		if(prependActionList == null) {
			prependActionList = new ArrayList<>();
		}
		if(prependActionList.size() == 0) {
			prependActionList.add(prependAction);
		} else {
			prependActionList.set(0, prependAction);
		}
	}

	@Override
	public List<PrependAction> getPrependActionList() {
		return prependActionList;
	}

	@Override
	public void setPrependActionList(List<PrependAction> prependActionList) {
		this.prependActionList = prependActionList;
	}

	@Override
	public boolean hasPrependAction() {
		return prependActionList != null && prependActionList.size() > 0 && prependActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(QuoteAction quoteAction) {
		quoteActionList = new ArrayList<QuoteAction>();
		quoteActionList.add(quoteAction);
	}

	@Override
	public QuoteAction getQuoteAction() {
		if(quoteActionList != null && quoteActionList.size() > 0) {
			return quoteActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setQuoteAction(QuoteAction quoteAction) {
		if(quoteActionList == null) {
			quoteActionList = new ArrayList<>();
		}
		if(quoteActionList.size() == 0) {
			quoteActionList.add(quoteAction);
		} else {
			quoteActionList.set(0, quoteAction);
		}
	}

	@Override
	public List<QuoteAction> getQuoteActionList() {
		return quoteActionList;
	}

	@Override
	public void setQuoteActionList(List<QuoteAction> quoteActionList) {
		this.quoteActionList = quoteActionList;
	}

	@Override
	public boolean hasQuoteAction() {
		return quoteActionList != null && quoteActionList.size() > 0 && quoteActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ReactAction reactAction) {
		reactActionList = new ArrayList<ReactAction>();
		reactActionList.add(reactAction);
	}

	@Override
	public ReactAction getReactAction() {
		if(reactActionList != null && reactActionList.size() > 0) {
			return reactActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReactAction(ReactAction reactAction) {
		if(reactActionList == null) {
			reactActionList = new ArrayList<>();
		}
		if(reactActionList.size() == 0) {
			reactActionList.add(reactAction);
		} else {
			reactActionList.set(0, reactAction);
		}
	}

	@Override
	public List<ReactAction> getReactActionList() {
		return reactActionList;
	}

	@Override
	public void setReactActionList(List<ReactAction> reactActionList) {
		this.reactActionList = reactActionList;
	}

	@Override
	public boolean hasReactAction() {
		return reactActionList != null && reactActionList.size() > 0 && reactActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ReadAction readAction) {
		readActionList = new ArrayList<ReadAction>();
		readActionList.add(readAction);
	}

	@Override
	public ReadAction getReadAction() {
		if(readActionList != null && readActionList.size() > 0) {
			return readActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReadAction(ReadAction readAction) {
		if(readActionList == null) {
			readActionList = new ArrayList<>();
		}
		if(readActionList.size() == 0) {
			readActionList.add(readAction);
		} else {
			readActionList.set(0, readAction);
		}
	}

	@Override
	public List<ReadAction> getReadActionList() {
		return readActionList;
	}

	@Override
	public void setReadActionList(List<ReadAction> readActionList) {
		this.readActionList = readActionList;
	}

	@Override
	public boolean hasReadAction() {
		return readActionList != null && readActionList.size() > 0 && readActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ReceiveAction receiveAction) {
		receiveActionList = new ArrayList<ReceiveAction>();
		receiveActionList.add(receiveAction);
	}

	@Override
	public ReceiveAction getReceiveAction() {
		if(receiveActionList != null && receiveActionList.size() > 0) {
			return receiveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReceiveAction(ReceiveAction receiveAction) {
		if(receiveActionList == null) {
			receiveActionList = new ArrayList<>();
		}
		if(receiveActionList.size() == 0) {
			receiveActionList.add(receiveAction);
		} else {
			receiveActionList.set(0, receiveAction);
		}
	}

	@Override
	public List<ReceiveAction> getReceiveActionList() {
		return receiveActionList;
	}

	@Override
	public void setReceiveActionList(List<ReceiveAction> receiveActionList) {
		this.receiveActionList = receiveActionList;
	}

	@Override
	public boolean hasReceiveAction() {
		return receiveActionList != null && receiveActionList.size() > 0 && receiveActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(RegisterAction registerAction) {
		registerActionList = new ArrayList<RegisterAction>();
		registerActionList.add(registerAction);
	}

	@Override
	public RegisterAction getRegisterAction() {
		if(registerActionList != null && registerActionList.size() > 0) {
			return registerActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRegisterAction(RegisterAction registerAction) {
		if(registerActionList == null) {
			registerActionList = new ArrayList<>();
		}
		if(registerActionList.size() == 0) {
			registerActionList.add(registerAction);
		} else {
			registerActionList.set(0, registerAction);
		}
	}

	@Override
	public List<RegisterAction> getRegisterActionList() {
		return registerActionList;
	}

	@Override
	public void setRegisterActionList(List<RegisterAction> registerActionList) {
		this.registerActionList = registerActionList;
	}

	@Override
	public boolean hasRegisterAction() {
		return registerActionList != null && registerActionList.size() > 0 && registerActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(RejectAction rejectAction) {
		rejectActionList = new ArrayList<RejectAction>();
		rejectActionList.add(rejectAction);
	}

	@Override
	public RejectAction getRejectAction() {
		if(rejectActionList != null && rejectActionList.size() > 0) {
			return rejectActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRejectAction(RejectAction rejectAction) {
		if(rejectActionList == null) {
			rejectActionList = new ArrayList<>();
		}
		if(rejectActionList.size() == 0) {
			rejectActionList.add(rejectAction);
		} else {
			rejectActionList.set(0, rejectAction);
		}
	}

	@Override
	public List<RejectAction> getRejectActionList() {
		return rejectActionList;
	}

	@Override
	public void setRejectActionList(List<RejectAction> rejectActionList) {
		this.rejectActionList = rejectActionList;
	}

	@Override
	public boolean hasRejectAction() {
		return rejectActionList != null && rejectActionList.size() > 0 && rejectActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(RentAction rentAction) {
		rentActionList = new ArrayList<RentAction>();
		rentActionList.add(rentAction);
	}

	@Override
	public RentAction getRentAction() {
		if(rentActionList != null && rentActionList.size() > 0) {
			return rentActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRentAction(RentAction rentAction) {
		if(rentActionList == null) {
			rentActionList = new ArrayList<>();
		}
		if(rentActionList.size() == 0) {
			rentActionList.add(rentAction);
		} else {
			rentActionList.set(0, rentAction);
		}
	}

	@Override
	public List<RentAction> getRentActionList() {
		return rentActionList;
	}

	@Override
	public void setRentActionList(List<RentAction> rentActionList) {
		this.rentActionList = rentActionList;
	}

	@Override
	public boolean hasRentAction() {
		return rentActionList != null && rentActionList.size() > 0 && rentActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ReplaceAction replaceAction) {
		replaceActionList = new ArrayList<ReplaceAction>();
		replaceActionList.add(replaceAction);
	}

	@Override
	public ReplaceAction getReplaceAction() {
		if(replaceActionList != null && replaceActionList.size() > 0) {
			return replaceActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReplaceAction(ReplaceAction replaceAction) {
		if(replaceActionList == null) {
			replaceActionList = new ArrayList<>();
		}
		if(replaceActionList.size() == 0) {
			replaceActionList.add(replaceAction);
		} else {
			replaceActionList.set(0, replaceAction);
		}
	}

	@Override
	public List<ReplaceAction> getReplaceActionList() {
		return replaceActionList;
	}

	@Override
	public void setReplaceActionList(List<ReplaceAction> replaceActionList) {
		this.replaceActionList = replaceActionList;
	}

	@Override
	public boolean hasReplaceAction() {
		return replaceActionList != null && replaceActionList.size() > 0 && replaceActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ReplyAction replyAction) {
		replyActionList = new ArrayList<ReplyAction>();
		replyActionList.add(replyAction);
	}

	@Override
	public ReplyAction getReplyAction() {
		if(replyActionList != null && replyActionList.size() > 0) {
			return replyActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReplyAction(ReplyAction replyAction) {
		if(replyActionList == null) {
			replyActionList = new ArrayList<>();
		}
		if(replyActionList.size() == 0) {
			replyActionList.add(replyAction);
		} else {
			replyActionList.set(0, replyAction);
		}
	}

	@Override
	public List<ReplyAction> getReplyActionList() {
		return replyActionList;
	}

	@Override
	public void setReplyActionList(List<ReplyAction> replyActionList) {
		this.replyActionList = replyActionList;
	}

	@Override
	public boolean hasReplyAction() {
		return replyActionList != null && replyActionList.size() > 0 && replyActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ReserveAction reserveAction) {
		reserveActionList = new ArrayList<ReserveAction>();
		reserveActionList.add(reserveAction);
	}

	@Override
	public ReserveAction getReserveAction() {
		if(reserveActionList != null && reserveActionList.size() > 0) {
			return reserveActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReserveAction(ReserveAction reserveAction) {
		if(reserveActionList == null) {
			reserveActionList = new ArrayList<>();
		}
		if(reserveActionList.size() == 0) {
			reserveActionList.add(reserveAction);
		} else {
			reserveActionList.set(0, reserveAction);
		}
	}

	@Override
	public List<ReserveAction> getReserveActionList() {
		return reserveActionList;
	}

	@Override
	public void setReserveActionList(List<ReserveAction> reserveActionList) {
		this.reserveActionList = reserveActionList;
	}

	@Override
	public boolean hasReserveAction() {
		return reserveActionList != null && reserveActionList.size() > 0 && reserveActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ResumeAction resumeAction) {
		resumeActionList = new ArrayList<ResumeAction>();
		resumeActionList.add(resumeAction);
	}

	@Override
	public ResumeAction getResumeAction() {
		if(resumeActionList != null && resumeActionList.size() > 0) {
			return resumeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setResumeAction(ResumeAction resumeAction) {
		if(resumeActionList == null) {
			resumeActionList = new ArrayList<>();
		}
		if(resumeActionList.size() == 0) {
			resumeActionList.add(resumeAction);
		} else {
			resumeActionList.set(0, resumeAction);
		}
	}

	@Override
	public List<ResumeAction> getResumeActionList() {
		return resumeActionList;
	}

	@Override
	public void setResumeActionList(List<ResumeAction> resumeActionList) {
		this.resumeActionList = resumeActionList;
	}

	@Override
	public boolean hasResumeAction() {
		return resumeActionList != null && resumeActionList.size() > 0 && resumeActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ReturnAction returnAction) {
		returnActionList = new ArrayList<ReturnAction>();
		returnActionList.add(returnAction);
	}

	@Override
	public ReturnAction getReturnAction() {
		if(returnActionList != null && returnActionList.size() > 0) {
			return returnActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReturnAction(ReturnAction returnAction) {
		if(returnActionList == null) {
			returnActionList = new ArrayList<>();
		}
		if(returnActionList.size() == 0) {
			returnActionList.add(returnAction);
		} else {
			returnActionList.set(0, returnAction);
		}
	}

	@Override
	public List<ReturnAction> getReturnActionList() {
		return returnActionList;
	}

	@Override
	public void setReturnActionList(List<ReturnAction> returnActionList) {
		this.returnActionList = returnActionList;
	}

	@Override
	public boolean hasReturnAction() {
		return returnActionList != null && returnActionList.size() > 0 && returnActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ReviewAction reviewAction) {
		reviewActionList = new ArrayList<ReviewAction>();
		reviewActionList.add(reviewAction);
	}

	@Override
	public ReviewAction getReviewAction() {
		if(reviewActionList != null && reviewActionList.size() > 0) {
			return reviewActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReviewAction(ReviewAction reviewAction) {
		if(reviewActionList == null) {
			reviewActionList = new ArrayList<>();
		}
		if(reviewActionList.size() == 0) {
			reviewActionList.add(reviewAction);
		} else {
			reviewActionList.set(0, reviewAction);
		}
	}

	@Override
	public List<ReviewAction> getReviewActionList() {
		return reviewActionList;
	}

	@Override
	public void setReviewActionList(List<ReviewAction> reviewActionList) {
		this.reviewActionList = reviewActionList;
	}

	@Override
	public boolean hasReviewAction() {
		return reviewActionList != null && reviewActionList.size() > 0 && reviewActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(RsvpAction rsvpAction) {
		rsvpActionList = new ArrayList<RsvpAction>();
		rsvpActionList.add(rsvpAction);
	}

	@Override
	public RsvpAction getRsvpAction() {
		if(rsvpActionList != null && rsvpActionList.size() > 0) {
			return rsvpActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setRsvpAction(RsvpAction rsvpAction) {
		if(rsvpActionList == null) {
			rsvpActionList = new ArrayList<>();
		}
		if(rsvpActionList.size() == 0) {
			rsvpActionList.add(rsvpAction);
		} else {
			rsvpActionList.set(0, rsvpAction);
		}
	}

	@Override
	public List<RsvpAction> getRsvpActionList() {
		return rsvpActionList;
	}

	@Override
	public void setRsvpActionList(List<RsvpAction> rsvpActionList) {
		this.rsvpActionList = rsvpActionList;
	}

	@Override
	public boolean hasRsvpAction() {
		return rsvpActionList != null && rsvpActionList.size() > 0 && rsvpActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ScheduleAction scheduleAction) {
		scheduleActionList = new ArrayList<ScheduleAction>();
		scheduleActionList.add(scheduleAction);
	}

	@Override
	public ScheduleAction getScheduleAction() {
		if(scheduleActionList != null && scheduleActionList.size() > 0) {
			return scheduleActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setScheduleAction(ScheduleAction scheduleAction) {
		if(scheduleActionList == null) {
			scheduleActionList = new ArrayList<>();
		}
		if(scheduleActionList.size() == 0) {
			scheduleActionList.add(scheduleAction);
		} else {
			scheduleActionList.set(0, scheduleAction);
		}
	}

	@Override
	public List<ScheduleAction> getScheduleActionList() {
		return scheduleActionList;
	}

	@Override
	public void setScheduleActionList(List<ScheduleAction> scheduleActionList) {
		this.scheduleActionList = scheduleActionList;
	}

	@Override
	public boolean hasScheduleAction() {
		return scheduleActionList != null && scheduleActionList.size() > 0 && scheduleActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(SearchAction searchAction) {
		searchActionList = new ArrayList<SearchAction>();
		searchActionList.add(searchAction);
	}

	@Override
	public SearchAction getSearchAction() {
		if(searchActionList != null && searchActionList.size() > 0) {
			return searchActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSearchAction(SearchAction searchAction) {
		if(searchActionList == null) {
			searchActionList = new ArrayList<>();
		}
		if(searchActionList.size() == 0) {
			searchActionList.add(searchAction);
		} else {
			searchActionList.set(0, searchAction);
		}
	}

	@Override
	public List<SearchAction> getSearchActionList() {
		return searchActionList;
	}

	@Override
	public void setSearchActionList(List<SearchAction> searchActionList) {
		this.searchActionList = searchActionList;
	}

	@Override
	public boolean hasSearchAction() {
		return searchActionList != null && searchActionList.size() > 0 && searchActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(SellAction sellAction) {
		sellActionList = new ArrayList<SellAction>();
		sellActionList.add(sellAction);
	}

	@Override
	public SellAction getSellAction() {
		if(sellActionList != null && sellActionList.size() > 0) {
			return sellActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSellAction(SellAction sellAction) {
		if(sellActionList == null) {
			sellActionList = new ArrayList<>();
		}
		if(sellActionList.size() == 0) {
			sellActionList.add(sellAction);
		} else {
			sellActionList.set(0, sellAction);
		}
	}

	@Override
	public List<SellAction> getSellActionList() {
		return sellActionList;
	}

	@Override
	public void setSellActionList(List<SellAction> sellActionList) {
		this.sellActionList = sellActionList;
	}

	@Override
	public boolean hasSellAction() {
		return sellActionList != null && sellActionList.size() > 0 && sellActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(SendAction sendAction) {
		sendActionList = new ArrayList<SendAction>();
		sendActionList.add(sendAction);
	}

	@Override
	public SendAction getSendAction() {
		if(sendActionList != null && sendActionList.size() > 0) {
			return sendActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSendAction(SendAction sendAction) {
		if(sendActionList == null) {
			sendActionList = new ArrayList<>();
		}
		if(sendActionList.size() == 0) {
			sendActionList.add(sendAction);
		} else {
			sendActionList.set(0, sendAction);
		}
	}

	@Override
	public List<SendAction> getSendActionList() {
		return sendActionList;
	}

	@Override
	public void setSendActionList(List<SendAction> sendActionList) {
		this.sendActionList = sendActionList;
	}

	@Override
	public boolean hasSendAction() {
		return sendActionList != null && sendActionList.size() > 0 && sendActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ShareAction shareAction) {
		shareActionList = new ArrayList<ShareAction>();
		shareActionList.add(shareAction);
	}

	@Override
	public ShareAction getShareAction() {
		if(shareActionList != null && shareActionList.size() > 0) {
			return shareActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setShareAction(ShareAction shareAction) {
		if(shareActionList == null) {
			shareActionList = new ArrayList<>();
		}
		if(shareActionList.size() == 0) {
			shareActionList.add(shareAction);
		} else {
			shareActionList.set(0, shareAction);
		}
	}

	@Override
	public List<ShareAction> getShareActionList() {
		return shareActionList;
	}

	@Override
	public void setShareActionList(List<ShareAction> shareActionList) {
		this.shareActionList = shareActionList;
	}

	@Override
	public boolean hasShareAction() {
		return shareActionList != null && shareActionList.size() > 0 && shareActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(SubscribeAction subscribeAction) {
		subscribeActionList = new ArrayList<SubscribeAction>();
		subscribeActionList.add(subscribeAction);
	}

	@Override
	public SubscribeAction getSubscribeAction() {
		if(subscribeActionList != null && subscribeActionList.size() > 0) {
			return subscribeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSubscribeAction(SubscribeAction subscribeAction) {
		if(subscribeActionList == null) {
			subscribeActionList = new ArrayList<>();
		}
		if(subscribeActionList.size() == 0) {
			subscribeActionList.add(subscribeAction);
		} else {
			subscribeActionList.set(0, subscribeAction);
		}
	}

	@Override
	public List<SubscribeAction> getSubscribeActionList() {
		return subscribeActionList;
	}

	@Override
	public void setSubscribeActionList(List<SubscribeAction> subscribeActionList) {
		this.subscribeActionList = subscribeActionList;
	}

	@Override
	public boolean hasSubscribeAction() {
		return subscribeActionList != null && subscribeActionList.size() > 0 && subscribeActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(SuspendAction suspendAction) {
		suspendActionList = new ArrayList<SuspendAction>();
		suspendActionList.add(suspendAction);
	}

	@Override
	public SuspendAction getSuspendAction() {
		if(suspendActionList != null && suspendActionList.size() > 0) {
			return suspendActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setSuspendAction(SuspendAction suspendAction) {
		if(suspendActionList == null) {
			suspendActionList = new ArrayList<>();
		}
		if(suspendActionList.size() == 0) {
			suspendActionList.add(suspendAction);
		} else {
			suspendActionList.set(0, suspendAction);
		}
	}

	@Override
	public List<SuspendAction> getSuspendActionList() {
		return suspendActionList;
	}

	@Override
	public void setSuspendActionList(List<SuspendAction> suspendActionList) {
		this.suspendActionList = suspendActionList;
	}

	@Override
	public boolean hasSuspendAction() {
		return suspendActionList != null && suspendActionList.size() > 0 && suspendActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(TakeAction takeAction) {
		takeActionList = new ArrayList<TakeAction>();
		takeActionList.add(takeAction);
	}

	@Override
	public TakeAction getTakeAction() {
		if(takeActionList != null && takeActionList.size() > 0) {
			return takeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTakeAction(TakeAction takeAction) {
		if(takeActionList == null) {
			takeActionList = new ArrayList<>();
		}
		if(takeActionList.size() == 0) {
			takeActionList.add(takeAction);
		} else {
			takeActionList.set(0, takeAction);
		}
	}

	@Override
	public List<TakeAction> getTakeActionList() {
		return takeActionList;
	}

	@Override
	public void setTakeActionList(List<TakeAction> takeActionList) {
		this.takeActionList = takeActionList;
	}

	@Override
	public boolean hasTakeAction() {
		return takeActionList != null && takeActionList.size() > 0 && takeActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(TieAction tieAction) {
		tieActionList = new ArrayList<TieAction>();
		tieActionList.add(tieAction);
	}

	@Override
	public TieAction getTieAction() {
		if(tieActionList != null && tieActionList.size() > 0) {
			return tieActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTieAction(TieAction tieAction) {
		if(tieActionList == null) {
			tieActionList = new ArrayList<>();
		}
		if(tieActionList.size() == 0) {
			tieActionList.add(tieAction);
		} else {
			tieActionList.set(0, tieAction);
		}
	}

	@Override
	public List<TieAction> getTieActionList() {
		return tieActionList;
	}

	@Override
	public void setTieActionList(List<TieAction> tieActionList) {
		this.tieActionList = tieActionList;
	}

	@Override
	public boolean hasTieAction() {
		return tieActionList != null && tieActionList.size() > 0 && tieActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(TipAction tipAction) {
		tipActionList = new ArrayList<TipAction>();
		tipActionList.add(tipAction);
	}

	@Override
	public TipAction getTipAction() {
		if(tipActionList != null && tipActionList.size() > 0) {
			return tipActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTipAction(TipAction tipAction) {
		if(tipActionList == null) {
			tipActionList = new ArrayList<>();
		}
		if(tipActionList.size() == 0) {
			tipActionList.add(tipAction);
		} else {
			tipActionList.set(0, tipAction);
		}
	}

	@Override
	public List<TipAction> getTipActionList() {
		return tipActionList;
	}

	@Override
	public void setTipActionList(List<TipAction> tipActionList) {
		this.tipActionList = tipActionList;
	}

	@Override
	public boolean hasTipAction() {
		return tipActionList != null && tipActionList.size() > 0 && tipActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(TrackAction trackAction) {
		trackActionList = new ArrayList<TrackAction>();
		trackActionList.add(trackAction);
	}

	@Override
	public TrackAction getTrackAction() {
		if(trackActionList != null && trackActionList.size() > 0) {
			return trackActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTrackAction(TrackAction trackAction) {
		if(trackActionList == null) {
			trackActionList = new ArrayList<>();
		}
		if(trackActionList.size() == 0) {
			trackActionList.add(trackAction);
		} else {
			trackActionList.set(0, trackAction);
		}
	}

	@Override
	public List<TrackAction> getTrackActionList() {
		return trackActionList;
	}

	@Override
	public void setTrackActionList(List<TrackAction> trackActionList) {
		this.trackActionList = trackActionList;
	}

	@Override
	public boolean hasTrackAction() {
		return trackActionList != null && trackActionList.size() > 0 && trackActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(TradeAction tradeAction) {
		tradeActionList = new ArrayList<TradeAction>();
		tradeActionList.add(tradeAction);
	}

	@Override
	public TradeAction getTradeAction() {
		if(tradeActionList != null && tradeActionList.size() > 0) {
			return tradeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTradeAction(TradeAction tradeAction) {
		if(tradeActionList == null) {
			tradeActionList = new ArrayList<>();
		}
		if(tradeActionList.size() == 0) {
			tradeActionList.add(tradeAction);
		} else {
			tradeActionList.set(0, tradeAction);
		}
	}

	@Override
	public List<TradeAction> getTradeActionList() {
		return tradeActionList;
	}

	@Override
	public void setTradeActionList(List<TradeAction> tradeActionList) {
		this.tradeActionList = tradeActionList;
	}

	@Override
	public boolean hasTradeAction() {
		return tradeActionList != null && tradeActionList.size() > 0 && tradeActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(TransferAction transferAction) {
		transferActionList = new ArrayList<TransferAction>();
		transferActionList.add(transferAction);
	}

	@Override
	public TransferAction getTransferAction() {
		if(transferActionList != null && transferActionList.size() > 0) {
			return transferActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTransferAction(TransferAction transferAction) {
		if(transferActionList == null) {
			transferActionList = new ArrayList<>();
		}
		if(transferActionList.size() == 0) {
			transferActionList.add(transferAction);
		} else {
			transferActionList.set(0, transferAction);
		}
	}

	@Override
	public List<TransferAction> getTransferActionList() {
		return transferActionList;
	}

	@Override
	public void setTransferActionList(List<TransferAction> transferActionList) {
		this.transferActionList = transferActionList;
	}

	@Override
	public boolean hasTransferAction() {
		return transferActionList != null && transferActionList.size() > 0 && transferActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(TravelAction travelAction) {
		travelActionList = new ArrayList<TravelAction>();
		travelActionList.add(travelAction);
	}

	@Override
	public TravelAction getTravelAction() {
		if(travelActionList != null && travelActionList.size() > 0) {
			return travelActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setTravelAction(TravelAction travelAction) {
		if(travelActionList == null) {
			travelActionList = new ArrayList<>();
		}
		if(travelActionList.size() == 0) {
			travelActionList.add(travelAction);
		} else {
			travelActionList.set(0, travelAction);
		}
	}

	@Override
	public List<TravelAction> getTravelActionList() {
		return travelActionList;
	}

	@Override
	public void setTravelActionList(List<TravelAction> travelActionList) {
		this.travelActionList = travelActionList;
	}

	@Override
	public boolean hasTravelAction() {
		return travelActionList != null && travelActionList.size() > 0 && travelActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(UnRegisterAction unRegisterAction) {
		unRegisterActionList = new ArrayList<UnRegisterAction>();
		unRegisterActionList.add(unRegisterAction);
	}

	@Override
	public UnRegisterAction getUnRegisterAction() {
		if(unRegisterActionList != null && unRegisterActionList.size() > 0) {
			return unRegisterActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setUnRegisterAction(UnRegisterAction unRegisterAction) {
		if(unRegisterActionList == null) {
			unRegisterActionList = new ArrayList<>();
		}
		if(unRegisterActionList.size() == 0) {
			unRegisterActionList.add(unRegisterAction);
		} else {
			unRegisterActionList.set(0, unRegisterAction);
		}
	}

	@Override
	public List<UnRegisterAction> getUnRegisterActionList() {
		return unRegisterActionList;
	}

	@Override
	public void setUnRegisterActionList(List<UnRegisterAction> unRegisterActionList) {
		this.unRegisterActionList = unRegisterActionList;
	}

	@Override
	public boolean hasUnRegisterAction() {
		return unRegisterActionList != null && unRegisterActionList.size() > 0 && unRegisterActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(UpdateAction updateAction) {
		updateActionList = new ArrayList<UpdateAction>();
		updateActionList.add(updateAction);
	}

	@Override
	public UpdateAction getUpdateAction() {
		if(updateActionList != null && updateActionList.size() > 0) {
			return updateActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setUpdateAction(UpdateAction updateAction) {
		if(updateActionList == null) {
			updateActionList = new ArrayList<>();
		}
		if(updateActionList.size() == 0) {
			updateActionList.add(updateAction);
		} else {
			updateActionList.set(0, updateAction);
		}
	}

	@Override
	public List<UpdateAction> getUpdateActionList() {
		return updateActionList;
	}

	@Override
	public void setUpdateActionList(List<UpdateAction> updateActionList) {
		this.updateActionList = updateActionList;
	}

	@Override
	public boolean hasUpdateAction() {
		return updateActionList != null && updateActionList.size() > 0 && updateActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(UseAction useAction) {
		useActionList = new ArrayList<UseAction>();
		useActionList.add(useAction);
	}

	@Override
	public UseAction getUseAction() {
		if(useActionList != null && useActionList.size() > 0) {
			return useActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setUseAction(UseAction useAction) {
		if(useActionList == null) {
			useActionList = new ArrayList<>();
		}
		if(useActionList.size() == 0) {
			useActionList.add(useAction);
		} else {
			useActionList.set(0, useAction);
		}
	}

	@Override
	public List<UseAction> getUseActionList() {
		return useActionList;
	}

	@Override
	public void setUseActionList(List<UseAction> useActionList) {
		this.useActionList = useActionList;
	}

	@Override
	public boolean hasUseAction() {
		return useActionList != null && useActionList.size() > 0 && useActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(ViewAction viewAction) {
		viewActionList = new ArrayList<ViewAction>();
		viewActionList.add(viewAction);
	}

	@Override
	public ViewAction getViewAction() {
		if(viewActionList != null && viewActionList.size() > 0) {
			return viewActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setViewAction(ViewAction viewAction) {
		if(viewActionList == null) {
			viewActionList = new ArrayList<>();
		}
		if(viewActionList.size() == 0) {
			viewActionList.add(viewAction);
		} else {
			viewActionList.set(0, viewAction);
		}
	}

	@Override
	public List<ViewAction> getViewActionList() {
		return viewActionList;
	}

	@Override
	public void setViewActionList(List<ViewAction> viewActionList) {
		this.viewActionList = viewActionList;
	}

	@Override
	public boolean hasViewAction() {
		return viewActionList != null && viewActionList.size() > 0 && viewActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(VoteAction voteAction) {
		voteActionList = new ArrayList<VoteAction>();
		voteActionList.add(voteAction);
	}

	@Override
	public VoteAction getVoteAction() {
		if(voteActionList != null && voteActionList.size() > 0) {
			return voteActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setVoteAction(VoteAction voteAction) {
		if(voteActionList == null) {
			voteActionList = new ArrayList<>();
		}
		if(voteActionList.size() == 0) {
			voteActionList.add(voteAction);
		} else {
			voteActionList.set(0, voteAction);
		}
	}

	@Override
	public List<VoteAction> getVoteActionList() {
		return voteActionList;
	}

	@Override
	public void setVoteActionList(List<VoteAction> voteActionList) {
		this.voteActionList = voteActionList;
	}

	@Override
	public boolean hasVoteAction() {
		return voteActionList != null && voteActionList.size() > 0 && voteActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(WantAction wantAction) {
		wantActionList = new ArrayList<WantAction>();
		wantActionList.add(wantAction);
	}

	@Override
	public WantAction getWantAction() {
		if(wantActionList != null && wantActionList.size() > 0) {
			return wantActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWantAction(WantAction wantAction) {
		if(wantActionList == null) {
			wantActionList = new ArrayList<>();
		}
		if(wantActionList.size() == 0) {
			wantActionList.add(wantAction);
		} else {
			wantActionList.set(0, wantAction);
		}
	}

	@Override
	public List<WantAction> getWantActionList() {
		return wantActionList;
	}

	@Override
	public void setWantActionList(List<WantAction> wantActionList) {
		this.wantActionList = wantActionList;
	}

	@Override
	public boolean hasWantAction() {
		return wantActionList != null && wantActionList.size() > 0 && wantActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(WatchAction watchAction) {
		watchActionList = new ArrayList<WatchAction>();
		watchActionList.add(watchAction);
	}

	@Override
	public WatchAction getWatchAction() {
		if(watchActionList != null && watchActionList.size() > 0) {
			return watchActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWatchAction(WatchAction watchAction) {
		if(watchActionList == null) {
			watchActionList = new ArrayList<>();
		}
		if(watchActionList.size() == 0) {
			watchActionList.add(watchAction);
		} else {
			watchActionList.set(0, watchAction);
		}
	}

	@Override
	public List<WatchAction> getWatchActionList() {
		return watchActionList;
	}

	@Override
	public void setWatchActionList(List<WatchAction> watchActionList) {
		this.watchActionList = watchActionList;
	}

	@Override
	public boolean hasWatchAction() {
		return watchActionList != null && watchActionList.size() > 0 && watchActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(WearAction wearAction) {
		wearActionList = new ArrayList<WearAction>();
		wearActionList.add(wearAction);
	}

	@Override
	public WearAction getWearAction() {
		if(wearActionList != null && wearActionList.size() > 0) {
			return wearActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWearAction(WearAction wearAction) {
		if(wearActionList == null) {
			wearActionList = new ArrayList<>();
		}
		if(wearActionList.size() == 0) {
			wearActionList.add(wearAction);
		} else {
			wearActionList.set(0, wearAction);
		}
	}

	@Override
	public List<WearAction> getWearActionList() {
		return wearActionList;
	}

	@Override
	public void setWearActionList(List<WearAction> wearActionList) {
		this.wearActionList = wearActionList;
	}

	@Override
	public boolean hasWearAction() {
		return wearActionList != null && wearActionList.size() > 0 && wearActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(WinAction winAction) {
		winActionList = new ArrayList<WinAction>();
		winActionList.add(winAction);
	}

	@Override
	public WinAction getWinAction() {
		if(winActionList != null && winActionList.size() > 0) {
			return winActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWinAction(WinAction winAction) {
		if(winActionList == null) {
			winActionList = new ArrayList<>();
		}
		if(winActionList.size() == 0) {
			winActionList.add(winAction);
		} else {
			winActionList.set(0, winAction);
		}
	}

	@Override
	public List<WinAction> getWinActionList() {
		return winActionList;
	}

	@Override
	public void setWinActionList(List<WinAction> winActionList) {
		this.winActionList = winActionList;
	}

	@Override
	public boolean hasWinAction() {
		return winActionList != null && winActionList.size() > 0 && winActionList.get(0) != null;
	}

	public POTENTIAL_ACTION(WriteAction writeAction) {
		writeActionList = new ArrayList<WriteAction>();
		writeActionList.add(writeAction);
	}

	@Override
	public WriteAction getWriteAction() {
		if(writeActionList != null && writeActionList.size() > 0) {
			return writeActionList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setWriteAction(WriteAction writeAction) {
		if(writeActionList == null) {
			writeActionList = new ArrayList<>();
		}
		if(writeActionList.size() == 0) {
			writeActionList.add(writeAction);
		} else {
			writeActionList.set(0, writeAction);
		}
	}

	@Override
	public List<WriteAction> getWriteActionList() {
		return writeActionList;
	}

	@Override
	public void setWriteActionList(List<WriteAction> writeActionList) {
		this.writeActionList = writeActionList;
	}

	@Override
	public boolean hasWriteAction() {
		return writeActionList != null && writeActionList.size() > 0 && writeActionList.get(0) != null;
	}

	public void copy(Container.PotentialAction org) {
		setAcceptActionList(org.getAcceptActionList());
		setAchieveActionList(org.getAchieveActionList());
		setActionList(org.getActionList());
		setActivateActionList(org.getActivateActionList());
		setAddActionList(org.getAddActionList());
		setAgreeActionList(org.getAgreeActionList());
		setAllocateActionList(org.getAllocateActionList());
		setAppendActionList(org.getAppendActionList());
		setApplyActionList(org.getApplyActionList());
		setArriveActionList(org.getArriveActionList());
		setAskActionList(org.getAskActionList());
		setAssessActionList(org.getAssessActionList());
		setAssignActionList(org.getAssignActionList());
		setAuthorizeActionList(org.getAuthorizeActionList());
		setBefriendActionList(org.getBefriendActionList());
		setBookmarkActionList(org.getBookmarkActionList());
		setBorrowActionList(org.getBorrowActionList());
		setBuyActionList(org.getBuyActionList());
		setCancelActionList(org.getCancelActionList());
		setCheckActionList(org.getCheckActionList());
		setCheckInActionList(org.getCheckInActionList());
		setCheckOutActionList(org.getCheckOutActionList());
		setChooseActionList(org.getChooseActionList());
		setCommentActionList(org.getCommentActionList());
		setCommunicateActionList(org.getCommunicateActionList());
		setConfirmActionList(org.getConfirmActionList());
		setConsumeActionList(org.getConsumeActionList());
		setControlActionList(org.getControlActionList());
		setCookActionList(org.getCookActionList());
		setCreateActionList(org.getCreateActionList());
		setDeactivateActionList(org.getDeactivateActionList());
		setDeleteActionList(org.getDeleteActionList());
		setDepartActionList(org.getDepartActionList());
		setDisagreeActionList(org.getDisagreeActionList());
		setDiscoverActionList(org.getDiscoverActionList());
		setDislikeActionList(org.getDislikeActionList());
		setDonateActionList(org.getDonateActionList());
		setDownloadActionList(org.getDownloadActionList());
		setDrawActionList(org.getDrawActionList());
		setDrinkActionList(org.getDrinkActionList());
		setEatActionList(org.getEatActionList());
		setEndorseActionList(org.getEndorseActionList());
		setExerciseActionList(org.getExerciseActionList());
		setFilmActionList(org.getFilmActionList());
		setFindActionList(org.getFindActionList());
		setFollowActionList(org.getFollowActionList());
		setGiveActionList(org.getGiveActionList());
		setIgnoreActionList(org.getIgnoreActionList());
		setInformActionList(org.getInformActionList());
		setInsertActionList(org.getInsertActionList());
		setInstallActionList(org.getInstallActionList());
		setInteractActionList(org.getInteractActionList());
		setInviteActionList(org.getInviteActionList());
		setJoinActionList(org.getJoinActionList());
		setLeaveActionList(org.getLeaveActionList());
		setLendActionList(org.getLendActionList());
		setLikeActionList(org.getLikeActionList());
		setListenActionList(org.getListenActionList());
		setLoseActionList(org.getLoseActionList());
		setMarryActionList(org.getMarryActionList());
		setMoneyTransferList(org.getMoneyTransferList());
		setMoveActionList(org.getMoveActionList());
		setOrderActionList(org.getOrderActionList());
		setOrganizeActionList(org.getOrganizeActionList());
		setPaintActionList(org.getPaintActionList());
		setPayActionList(org.getPayActionList());
		setPerformActionList(org.getPerformActionList());
		setPhotographActionList(org.getPhotographActionList());
		setPlanActionList(org.getPlanActionList());
		setPlayActionList(org.getPlayActionList());
		setPreOrderActionList(org.getPreOrderActionList());
		setPrependActionList(org.getPrependActionList());
		setQuoteActionList(org.getQuoteActionList());
		setReactActionList(org.getReactActionList());
		setReadActionList(org.getReadActionList());
		setReceiveActionList(org.getReceiveActionList());
		setRegisterActionList(org.getRegisterActionList());
		setRejectActionList(org.getRejectActionList());
		setRentActionList(org.getRentActionList());
		setReplaceActionList(org.getReplaceActionList());
		setReplyActionList(org.getReplyActionList());
		setReserveActionList(org.getReserveActionList());
		setResumeActionList(org.getResumeActionList());
		setReturnActionList(org.getReturnActionList());
		setReviewActionList(org.getReviewActionList());
		setRsvpActionList(org.getRsvpActionList());
		setScheduleActionList(org.getScheduleActionList());
		setSearchActionList(org.getSearchActionList());
		setSellActionList(org.getSellActionList());
		setSendActionList(org.getSendActionList());
		setShareActionList(org.getShareActionList());
		setSubscribeActionList(org.getSubscribeActionList());
		setSuspendActionList(org.getSuspendActionList());
		setTakeActionList(org.getTakeActionList());
		setTieActionList(org.getTieActionList());
		setTipActionList(org.getTipActionList());
		setTrackActionList(org.getTrackActionList());
		setTradeActionList(org.getTradeActionList());
		setTransferActionList(org.getTransferActionList());
		setTravelActionList(org.getTravelActionList());
		setUnRegisterActionList(org.getUnRegisterActionList());
		setUpdateActionList(org.getUpdateActionList());
		setUseActionList(org.getUseActionList());
		setViewActionList(org.getViewActionList());
		setVoteActionList(org.getVoteActionList());
		setWantActionList(org.getWantActionList());
		setWatchActionList(org.getWatchActionList());
		setWearActionList(org.getWearActionList());
		setWinActionList(org.getWinActionList());
		setWriteActionList(org.getWriteActionList());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
