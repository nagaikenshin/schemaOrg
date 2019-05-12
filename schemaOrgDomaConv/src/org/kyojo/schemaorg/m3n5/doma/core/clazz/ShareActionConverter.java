package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SHARE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.ShareAction;

@ExternalDomain
public class ShareActionConverter implements DomainConverter<ShareAction, String> {

	@Override
	public String fromDomainToValue(ShareAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ShareAction fromValueToDomain(String value) {
		return new SHARE_ACTION(value);
	}

}
