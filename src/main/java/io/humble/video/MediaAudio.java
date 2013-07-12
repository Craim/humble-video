/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.humble.video;
import io.humble.ferry.*;
/**
 * Raw audio data.  
 * <p>  
 * The data described by the sample format is always in native-endian 
 * order.  
 * </p><p>  
 * The floating-point formats are based on full volume being in the 
 * range  
 * [-1.0, 1.0]. Any values outside this range are beyond full volume 
 * level.  
 * </p><p>  
 * The data layout is as follows:  
 * </p><p>  
 * For planar sample formats, each audio channel is in a separate data 
 * plane,  
 * and {@link MediaAudio#getDataLineSize(int)} is the buffer size, in 
 * bytes, for a single plane. All data  
 * planes must be the same size. For packed sample formats, only the 
 * first data  
 * plane is used, and samples for each channel are interleaved. In this 
 * case,  
 * {@link MediaAudio#getDataLineSize(int)} is the buffer size, in bytes, 
 * for the 1 plane.  
 * </p>  
 */
public class MediaAudio extends MediaRaw {
  // JNIHelper.swg: Start generated code
  // >>>>>>>>>>>>>>>>>>>>>>>>>>>
  /**
   * This method is only here to use some references and remove
   * a Eclipse compiler warning.
   */
  @SuppressWarnings("unused")
  private void noop()
  {
    IBuffer.make(null, 1);
  }
   
  private volatile long swigCPtr;

  /**
   * Internal Only.
   */
  protected MediaAudio(long cPtr, boolean cMemoryOwn) {
    super(VideoJNI.SWIGMediaAudioUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }
  
  /**
   * Internal Only.
   */
  protected MediaAudio(long cPtr, boolean cMemoryOwn,
      java.util.concurrent.atomic.AtomicLong ref)
  {
    super(VideoJNI.SWIGMediaAudioUpcast(cPtr),
     cMemoryOwn, ref);
    swigCPtr = cPtr;
  }
    
  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that obj is proxying for.
   *   
   * @param obj The java proxy object for a native object.
   * @return The raw pointer obj is proxying for.
   */
  protected static long getCPtr(MediaAudio obj) {
    if (obj == null) return 0;
    return obj.getMyCPtr();
  }

  /**
   * Internal Only.  Not part of public API.
   *
   * Get the raw value of the native object that we're proxying for.
   *   
   * @return The raw pointer we're proxying for.
   */  
  protected long getMyCPtr() {
    if (swigCPtr == 0) throw new IllegalStateException("underlying native object already deleted");
    return swigCPtr;
  }
  
  /**
   * Create a new MediaAudio object that is actually referring to the
   * exact same underlying native object.
   *
   * @return the new Java object.
   */
  @Override
  public MediaAudio copyReference() {
    if (swigCPtr == 0)
      return null;
    else
      return new MediaAudio(swigCPtr, swigCMemOwn, getJavaRefCount());
  }

  /**
   * Compares two values, returning true if the underlying objects in native code are the same object.
   *
   * That means you can have two different Java objects, but when you do a comparison, you'll find out
   * they are the EXACT same object.
   *
   * @return True if the underlying native object is the same.  False otherwise.
   */
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof MediaAudio)
      equal = (((MediaAudio)obj).swigCPtr == this.swigCPtr);
    return equal;
  }
  
  /**
   * Get a hashable value for this object.
   *
   * @return the hashable value.
   */
  public int hashCode() {
     return (int)swigCPtr;
  }
  
  // <<<<<<<<<<<<<<<<<<<<<<<<<<<
  // JNIHelper.swg: End generated code
  

/**
 * Create a MediaAudio and the underlying data.  
 * @return	A {@link MediaAudio} object, or null on failure.  
 */
  public static MediaAudio make(int maxSamples, int channels, AudioFormat.Type format) {
    long cPtr = VideoJNI.MediaAudio_make__SWIG_0(maxSamples, channels, format.swigValue());
    return (cPtr == 0) ? null : new MediaAudio(cPtr, false);
  }

/**
 * Create a MediaAudio using the given buffer.  
 * Note: that the {@link IBuffer.getBufferSize()} constraints the max 
 * number  
 * of samples we can place in here, and HumbleVideo needs to reserve 
 * some  
 * of the buffer for, um, stuff (assume at least 64 bytes). So {@link 
 * #getMaxNumSamples()}  
 * may not return as many as you think you can fit in here.  
 * @return	A {@link MediaAudio} object, or null on failure.  
 */
  public static MediaAudio make(IBuffer buffer, int channels, AudioFormat.Type format) {
    long cPtr = VideoJNI.MediaAudio_make__SWIG_1(IBuffer.getCPtr(buffer), buffer, channels, format.swigValue());
    return (cPtr == 0) ? null : new MediaAudio(cPtr, false);
  }

/**
 * Get any underlying raw data available for this object.  
 * @param	plane The plane number if {@link getFormat()} is Planar (rather 
 *		 
 * @return	The raw data, or null if not accessible.  
 */
  public IBuffer getData(int plane) {
    long cPtr = VideoJNI.MediaAudio_getData(swigCPtr, this, plane);
    return (cPtr == 0) ? null : new IBuffer(cPtr, false);
  }

/**
 * The total number of bytes in {@link #getData()} that represent valid 
 * audio data.  
 * @return	The size in bytes of that plane of audio data.  
 */
  public int getDataPlaneSize() {
    return VideoJNI.MediaAudio_getDataPlaneSize(swigCPtr, this);
  }

/**
 * Returns the number of data planes in this object.  
 */
  public int getNumDataPlanes() {
    return VideoJNI.MediaAudio_getNumDataPlanes(swigCPtr, this);
  }

/**
 * @return	maximum of samples of {@link #getChannels()} {@link #getFormat()} 
 *		 audio that can be put in this {@link AudioSamples} 
 *		 object.  
 */
  public int getMaxNumSamples() {
    return VideoJNI.MediaAudio_getMaxNumSamples(swigCPtr, this);
  }

/**
 * Number of bytes in one sample of one channel of audio in this object. 
 *  
 */
  public int getBytesPerSample() {
    return VideoJNI.MediaAudio_getBytesPerSample(swigCPtr, this);
  }

/**
 * Call this if you modify the samples and are now done. This  
 * updates the pertinent information in the structure.  
 * @param	complete Is this set of samples complete?  
 * @param	numSamples Number of samples in this update (note that  
 * 4 shorts of 16-bit audio in stereo is actually 1 sample).  
 * @param	sampleRate The sample rate (in Hz) of this set of samples. 
 *		  
 * @param	channels The number of channels in this set of samples.  
 * @param	format The sample-format of this set of samples.  
 * @param	pts The presentation time stamp of the starting sample in 
 *		 this buffer.  
 * Caller must ensure pts is in units of 1/1,000,000 of a second  
 */
  public void setComplete(boolean complete, long numSamples, int sampleRate, int channels, AudioFormat.Type format, long pts) {
    VideoJNI.MediaAudio_setComplete(swigCPtr, this, complete, numSamples, sampleRate, channels, format.swigValue(), pts);
  }

/**
 * Sample rate of audio, or 0 if unknown.  
 */
  public int getSampleRate() {
    return VideoJNI.MediaAudio_getSampleRate(swigCPtr, this);
  }

/**
 * Number of channels of audio in this object.  
 */
  public int getChannels() {
    return VideoJNI.MediaAudio_getChannels(swigCPtr, this);
  }

/**
 * Format of audio in this object.  
 */
  public AudioFormat.Type getFormat() {
    return AudioFormat.Type.swigToEnum(VideoJNI.MediaAudio_getFormat(swigCPtr, this));
  }

/**
 * Does this object have complete data? If not, other methods may return 
 * unknown.  
 */
  public boolean isComplete() {
    return VideoJNI.MediaAudio_isComplete(swigCPtr, this);
  }

/**
 * Was this audio decoded from a key packet?  
 */
  public boolean isKey() {
    return VideoJNI.MediaAudio_isKey(swigCPtr, this);
  }

/**
 * Is audio laid out in a planar format?  
 */
  public boolean isPlanar() {
    return VideoJNI.MediaAudio_isPlanar(swigCPtr, this);
  }

/**
 * What is the channel layout of the audio in this buffer?  
 */
  public AudioChannel.Layout getChannelLayout() {
    return AudioChannel.Layout.swigToEnum(VideoJNI.MediaAudio_getChannelLayout(swigCPtr, this));
  }

}
