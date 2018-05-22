package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DISCUSSION_FORUM_POSTING;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DiscussionForumPosting;

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
