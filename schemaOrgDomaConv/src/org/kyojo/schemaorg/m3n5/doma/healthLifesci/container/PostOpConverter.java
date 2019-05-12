package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.POST_OP;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.PostOp;

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
