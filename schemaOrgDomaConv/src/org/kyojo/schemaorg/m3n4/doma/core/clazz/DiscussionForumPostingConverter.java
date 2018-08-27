package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DISCUSSION_FORUM_POSTING;
import org.kyojo.schemaorg.m3n4.core.Clazz.DiscussionForumPosting;

@ExternalDomain
public class DiscussionForumPostingConverter implements DomainConverter<DiscussionForumPosting, String> {

	@Override
	public String fromDomainToValue(DiscussionForumPosting domain) {
		return domain.getNativeValue();
	}

	@Override
	public DiscussionForumPosting fromValueToDomain(String value) {
		return new DISCUSSION_FORUM_POSTING(value);
	}

}
