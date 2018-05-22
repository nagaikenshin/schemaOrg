package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.POST_OP;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.PostOp;

@ExternalDomain
public class PostOpConverter implements DomainConverter<PostOp, String> {

	@Override
	public String fromDomainToValue(PostOp domain) {
		return domain.getNativeValue();
	}

	@Override
	public PostOp fromValueToDomain(String value) {
		return new POST_OP(value);
	}

}
