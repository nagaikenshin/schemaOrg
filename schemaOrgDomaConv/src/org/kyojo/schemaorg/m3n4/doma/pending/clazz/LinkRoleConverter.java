package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.LINK_ROLE;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LinkRole;

@ExternalDomain
public class LinkRoleConverter implements DomainConverter<LinkRole, String> {

	@Override
	public String fromDomainToValue(LinkRole domain) {
		return domain.getNativeValue();
	}

	@Override
	public LinkRole fromValueToDomain(String value) {
		return new LINK_ROLE(value);
	}

}
