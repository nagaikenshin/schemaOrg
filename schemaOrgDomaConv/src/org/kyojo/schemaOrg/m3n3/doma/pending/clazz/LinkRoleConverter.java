package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LINK_ROLE;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.LinkRole;

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
