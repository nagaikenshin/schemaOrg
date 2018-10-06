package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.NewsArticle;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AnalysisNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.AskPublicNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.BackgroundNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.OpinionNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ReportageNewsArticle;
import org.kyojo.schemaorg.m3n4.pending.Clazz.ReviewNewsArticle;

public class ASSOCIATED_ARTICLE implements Container.AssociatedArticle {

	private static final long serialVersionUID = 1L;

	public List<AnalysisNewsArticle> analysisNewsArticleList;
	public List<AskPublicNewsArticle> askPublicNewsArticleList;
	public List<BackgroundNewsArticle> backgroundNewsArticleList;
	public List<NewsArticle> newsArticleList;
	public List<OpinionNewsArticle> opinionNewsArticleList;
	public List<ReportageNewsArticle> reportageNewsArticleList;
	public List<ReviewNewsArticle> reviewNewsArticleList;

	public ASSOCIATED_ARTICLE() {
	}

	public ASSOCIATED_ARTICLE(String string) {
		this(new NEWS_ARTICLE(string));
	}

	public String getString() {
		if(newsArticleList == null || newsArticleList.size() == 0 || newsArticleList.get(0) == null) {
			return null;
		} else {
			Name name = newsArticleList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(newsArticleList == null) {
			newsArticleList = new ArrayList<NewsArticle>();
		}
		if(newsArticleList.size() == 0) {
			newsArticleList.add(new NEWS_ARTICLE(string));
		} else {
			newsArticleList.set(0, new NEWS_ARTICLE(string));
		}
	}

	public ASSOCIATED_ARTICLE(AnalysisNewsArticle analysisNewsArticle) {
		analysisNewsArticleList = new ArrayList<AnalysisNewsArticle>();
		analysisNewsArticleList.add(analysisNewsArticle);
	}

	@Override
	public AnalysisNewsArticle getAnalysisNewsArticle() {
		if(analysisNewsArticleList != null && analysisNewsArticleList.size() > 0) {
			return analysisNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAnalysisNewsArticle(AnalysisNewsArticle analysisNewsArticle) {
		if(analysisNewsArticleList == null) {
			analysisNewsArticleList = new ArrayList<>();
		}
		if(analysisNewsArticleList.size() == 0) {
			analysisNewsArticleList.add(analysisNewsArticle);
		} else {
			analysisNewsArticleList.set(0, analysisNewsArticle);
		}
	}

	@Override
	public List<AnalysisNewsArticle> getAnalysisNewsArticleList() {
		return analysisNewsArticleList;
	}

	@Override
	public void setAnalysisNewsArticleList(List<AnalysisNewsArticle> analysisNewsArticleList) {
		this.analysisNewsArticleList = analysisNewsArticleList;
	}

	@Override
	public boolean hasAnalysisNewsArticle() {
		return analysisNewsArticleList != null && analysisNewsArticleList.size() > 0 && analysisNewsArticleList.get(0) != null;
	}

	public ASSOCIATED_ARTICLE(AskPublicNewsArticle askPublicNewsArticle) {
		askPublicNewsArticleList = new ArrayList<AskPublicNewsArticle>();
		askPublicNewsArticleList.add(askPublicNewsArticle);
	}

	@Override
	public AskPublicNewsArticle getAskPublicNewsArticle() {
		if(askPublicNewsArticleList != null && askPublicNewsArticleList.size() > 0) {
			return askPublicNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setAskPublicNewsArticle(AskPublicNewsArticle askPublicNewsArticle) {
		if(askPublicNewsArticleList == null) {
			askPublicNewsArticleList = new ArrayList<>();
		}
		if(askPublicNewsArticleList.size() == 0) {
			askPublicNewsArticleList.add(askPublicNewsArticle);
		} else {
			askPublicNewsArticleList.set(0, askPublicNewsArticle);
		}
	}

	@Override
	public List<AskPublicNewsArticle> getAskPublicNewsArticleList() {
		return askPublicNewsArticleList;
	}

	@Override
	public void setAskPublicNewsArticleList(List<AskPublicNewsArticle> askPublicNewsArticleList) {
		this.askPublicNewsArticleList = askPublicNewsArticleList;
	}

	@Override
	public boolean hasAskPublicNewsArticle() {
		return askPublicNewsArticleList != null && askPublicNewsArticleList.size() > 0 && askPublicNewsArticleList.get(0) != null;
	}

	public ASSOCIATED_ARTICLE(BackgroundNewsArticle backgroundNewsArticle) {
		backgroundNewsArticleList = new ArrayList<BackgroundNewsArticle>();
		backgroundNewsArticleList.add(backgroundNewsArticle);
	}

	@Override
	public BackgroundNewsArticle getBackgroundNewsArticle() {
		if(backgroundNewsArticleList != null && backgroundNewsArticleList.size() > 0) {
			return backgroundNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setBackgroundNewsArticle(BackgroundNewsArticle backgroundNewsArticle) {
		if(backgroundNewsArticleList == null) {
			backgroundNewsArticleList = new ArrayList<>();
		}
		if(backgroundNewsArticleList.size() == 0) {
			backgroundNewsArticleList.add(backgroundNewsArticle);
		} else {
			backgroundNewsArticleList.set(0, backgroundNewsArticle);
		}
	}

	@Override
	public List<BackgroundNewsArticle> getBackgroundNewsArticleList() {
		return backgroundNewsArticleList;
	}

	@Override
	public void setBackgroundNewsArticleList(List<BackgroundNewsArticle> backgroundNewsArticleList) {
		this.backgroundNewsArticleList = backgroundNewsArticleList;
	}

	@Override
	public boolean hasBackgroundNewsArticle() {
		return backgroundNewsArticleList != null && backgroundNewsArticleList.size() > 0 && backgroundNewsArticleList.get(0) != null;
	}

	public ASSOCIATED_ARTICLE(NewsArticle newsArticle) {
		newsArticleList = new ArrayList<NewsArticle>();
		newsArticleList.add(newsArticle);
	}

	@Override
	public NewsArticle getNewsArticle() {
		if(newsArticleList != null && newsArticleList.size() > 0) {
			return newsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setNewsArticle(NewsArticle newsArticle) {
		if(newsArticleList == null) {
			newsArticleList = new ArrayList<>();
		}
		if(newsArticleList.size() == 0) {
			newsArticleList.add(newsArticle);
		} else {
			newsArticleList.set(0, newsArticle);
		}
	}

	@Override
	public List<NewsArticle> getNewsArticleList() {
		return newsArticleList;
	}

	@Override
	public void setNewsArticleList(List<NewsArticle> newsArticleList) {
		this.newsArticleList = newsArticleList;
	}

	@Override
	public boolean hasNewsArticle() {
		return newsArticleList != null && newsArticleList.size() > 0 && newsArticleList.get(0) != null;
	}

	public ASSOCIATED_ARTICLE(OpinionNewsArticle opinionNewsArticle) {
		opinionNewsArticleList = new ArrayList<OpinionNewsArticle>();
		opinionNewsArticleList.add(opinionNewsArticle);
	}

	@Override
	public OpinionNewsArticle getOpinionNewsArticle() {
		if(opinionNewsArticleList != null && opinionNewsArticleList.size() > 0) {
			return opinionNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setOpinionNewsArticle(OpinionNewsArticle opinionNewsArticle) {
		if(opinionNewsArticleList == null) {
			opinionNewsArticleList = new ArrayList<>();
		}
		if(opinionNewsArticleList.size() == 0) {
			opinionNewsArticleList.add(opinionNewsArticle);
		} else {
			opinionNewsArticleList.set(0, opinionNewsArticle);
		}
	}

	@Override
	public List<OpinionNewsArticle> getOpinionNewsArticleList() {
		return opinionNewsArticleList;
	}

	@Override
	public void setOpinionNewsArticleList(List<OpinionNewsArticle> opinionNewsArticleList) {
		this.opinionNewsArticleList = opinionNewsArticleList;
	}

	@Override
	public boolean hasOpinionNewsArticle() {
		return opinionNewsArticleList != null && opinionNewsArticleList.size() > 0 && opinionNewsArticleList.get(0) != null;
	}

	public ASSOCIATED_ARTICLE(ReportageNewsArticle reportageNewsArticle) {
		reportageNewsArticleList = new ArrayList<ReportageNewsArticle>();
		reportageNewsArticleList.add(reportageNewsArticle);
	}

	@Override
	public ReportageNewsArticle getReportageNewsArticle() {
		if(reportageNewsArticleList != null && reportageNewsArticleList.size() > 0) {
			return reportageNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReportageNewsArticle(ReportageNewsArticle reportageNewsArticle) {
		if(reportageNewsArticleList == null) {
			reportageNewsArticleList = new ArrayList<>();
		}
		if(reportageNewsArticleList.size() == 0) {
			reportageNewsArticleList.add(reportageNewsArticle);
		} else {
			reportageNewsArticleList.set(0, reportageNewsArticle);
		}
	}

	@Override
	public List<ReportageNewsArticle> getReportageNewsArticleList() {
		return reportageNewsArticleList;
	}

	@Override
	public void setReportageNewsArticleList(List<ReportageNewsArticle> reportageNewsArticleList) {
		this.reportageNewsArticleList = reportageNewsArticleList;
	}

	@Override
	public boolean hasReportageNewsArticle() {
		return reportageNewsArticleList != null && reportageNewsArticleList.size() > 0 && reportageNewsArticleList.get(0) != null;
	}

	public ASSOCIATED_ARTICLE(ReviewNewsArticle reviewNewsArticle) {
		reviewNewsArticleList = new ArrayList<ReviewNewsArticle>();
		reviewNewsArticleList.add(reviewNewsArticle);
	}

	@Override
	public ReviewNewsArticle getReviewNewsArticle() {
		if(reviewNewsArticleList != null && reviewNewsArticleList.size() > 0) {
			return reviewNewsArticleList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setReviewNewsArticle(ReviewNewsArticle reviewNewsArticle) {
		if(reviewNewsArticleList == null) {
			reviewNewsArticleList = new ArrayList<>();
		}
		if(reviewNewsArticleList.size() == 0) {
			reviewNewsArticleList.add(reviewNewsArticle);
		} else {
			reviewNewsArticleList.set(0, reviewNewsArticle);
		}
	}

	@Override
	public List<ReviewNewsArticle> getReviewNewsArticleList() {
		return reviewNewsArticleList;
	}

	@Override
	public void setReviewNewsArticleList(List<ReviewNewsArticle> reviewNewsArticleList) {
		this.reviewNewsArticleList = reviewNewsArticleList;
	}

	@Override
	public boolean hasReviewNewsArticle() {
		return reviewNewsArticleList != null && reviewNewsArticleList.size() > 0 && reviewNewsArticleList.get(0) != null;
	}

	public ASSOCIATED_ARTICLE(List<AnalysisNewsArticle> analysisNewsArticleList,
			List<AskPublicNewsArticle> askPublicNewsArticleList,
			List<BackgroundNewsArticle> backgroundNewsArticleList,
			List<NewsArticle> newsArticleList,
			List<OpinionNewsArticle> opinionNewsArticleList,
			List<ReportageNewsArticle> reportageNewsArticleList,
			List<ReviewNewsArticle> reviewNewsArticleList) {
		setAnalysisNewsArticleList(analysisNewsArticleList);
		setAskPublicNewsArticleList(askPublicNewsArticleList);
		setBackgroundNewsArticleList(backgroundNewsArticleList);
		setNewsArticleList(newsArticleList);
		setOpinionNewsArticleList(opinionNewsArticleList);
		setReportageNewsArticleList(reportageNewsArticleList);
		setReviewNewsArticleList(reviewNewsArticleList);
	}

	public void copy(Container.AssociatedArticle org) {
		setAnalysisNewsArticleList(org.getAnalysisNewsArticleList());
		setAskPublicNewsArticleList(org.getAskPublicNewsArticleList());
		setBackgroundNewsArticleList(org.getBackgroundNewsArticleList());
		setNewsArticleList(org.getNewsArticleList());
		setOpinionNewsArticleList(org.getOpinionNewsArticleList());
		setReportageNewsArticleList(org.getReportageNewsArticleList());
		setReviewNewsArticleList(org.getReviewNewsArticleList());
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
