/*
 * Copyright (c) 2002-2011 LWJGL Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'LWJGL' nor the names of
 *   its contributors may be used to endorse or promote products derived
 *   from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.lwjgl.opengl;

import org.lwjgl.util.generator.Alias;
import org.lwjgl.util.generator.Dependent;
import org.lwjgl.util.generator.Reuse;
import org.lwjgl.util.generator.opengl.GLenum;
import org.lwjgl.util.generator.opengl.GLsizei;
import org.lwjgl.util.generator.opengl.GLuint;

@Dependent
@Alias(value = "EXT_texture_storage", postfix = "EXT")
public interface ARB_texture_storage {

	/** Accepted by the &lt;value&gt; parameter of GetTexParameter{if}v: */
	int GL_TEXTURE_IMMUTABLE_FORMAT = 0x912F;

	@Reuse("GL42")
	void glTexStorage1D(@GLenum int target, @GLsizei int levels,
	                    @GLenum int internalformat,
	                    @GLsizei int width);

	@Reuse("GL42")
	void glTexStorage2D(@GLenum int target, @GLsizei int levels,
	                    @GLenum int internalformat,
	                    @GLsizei int width, @GLsizei int height);

	@Reuse("GL42")
	void glTexStorage3D(@GLenum int target, @GLsizei int levels,
	                    @GLenum int internalformat,
	                    @GLsizei int width, @GLsizei int height, @GLsizei int depth);

	@Dependent("GL_EXT_direct_state_access")
	void glTextureStorage1DEXT(@GLuint int texture, @GLenum int target, @GLsizei int levels,
	                           @GLenum int internalformat,
	                           @GLsizei int width);

	@Dependent("GL_EXT_direct_state_access")
	void glTextureStorage2DEXT(@GLuint int texture, @GLenum int target, @GLsizei int levels,
	                           @GLenum int internalformat,
	                           @GLsizei int width, @GLsizei int height);

	@Dependent("GL_EXT_direct_state_access")
	void glTextureStorage3DEXT(@GLuint int texture, @GLenum int target, @GLsizei int levels,
	                           @GLenum int internalformat,
	                           @GLsizei int width, @GLsizei int height, @GLsizei int depth);

}